import { FormEvent, useState } from 'react';
import { NavLink, Route, Routes, useNavigate } from 'react-router-dom';

const API_URL = 'http://localhost:8080/api';

type AuthResponse = { email: string; fullName: string; role: string; token: string };

function AuthPage({ onAuthenticated }: { onAuthenticated: (auth: AuthResponse) => void }) {
  const [register, setRegister] = useState(false);
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [fullName, setFullName] = useState('');
  const [error, setError] = useState('');

  async function submit(event: FormEvent) {
    event.preventDefault();
    setError('');
    try {
      const response = await fetch(`${API_URL}/auth/${register ? 'register' : 'login'}`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(register ? { email, password, fullName } : { email, password })
      });
      if (!response.ok) throw new Error(response.status === 401 ? 'Credenciales inválidas' : 'No se pudo completar la solicitud');
      onAuthenticated(await response.json() as AuthResponse);
    } catch (requestError) {
      setError(requestError instanceof Error ? requestError.message : 'Error de conexión');
    }
  }

  return (
    <main className="auth-page">
      <form className="auth-card" onSubmit={submit}>
        <span className="brand-badge">LMS</span>
        <h1>{register ? 'Crear cuenta' : 'Iniciar sesión'}</h1>
        <p>{register ? 'Comienza a organizar tus finanzas.' : 'Accede a tu espacio financiero.'}</p>
        {register && <input required maxLength={120} placeholder="Nombre completo" value={fullName} onChange={(event) => setFullName(event.target.value)} />}
        <input required type="email" placeholder="Correo electrónico" value={email} onChange={(event) => setEmail(event.target.value)} />
        <input required minLength={8} type="password" placeholder="Contraseña (mínimo 8 caracteres)" value={password} onChange={(event) => setPassword(event.target.value)} />
        {error && <div className="form-error">{error}</div>}
        <button type="submit">{register ? 'Registrarme' : 'Entrar'}</button>
        <button type="button" className="link-button" onClick={() => setRegister(!register)}>
          {register ? 'Ya tengo una cuenta' : 'Crear una cuenta'}
        </button>
      </form>
    </main>
  );
}

function DashboardPage({ name }: { name: string }) {
  return <section><h1>Hola, {name}</h1><p>Este es el resumen de tus finanzas personales.</p><div className="cards">
    <article className="card accent-blue"><span>Saldo total</span><strong>$ 0.00</strong></article>
    <article className="card accent-green"><span>Ingresos</span><strong>$ 0.00</strong></article>
    <article className="card accent-red"><span>Gastos</span><strong>$ 0.00</strong></article>
  </div></section>;
}

const pages = [
  ['/', 'Dashboard'], ['/cuentas', 'Cuentas'], ['/movimientos', 'Movimientos'],
  ['/deudas', 'Deudas'], ['/metas', 'Metas'], ['/compras', 'Compras']
];

export default function App() {
  const [auth, setAuth] = useState<AuthResponse | null>(() => {
    const stored = localStorage.getItem('lms-auth');
    return stored ? JSON.parse(stored) as AuthResponse : null;
  });
  const navigate = useNavigate();

  function authenticated(nextAuth: AuthResponse) {
    localStorage.setItem('lms-auth', JSON.stringify(nextAuth));
    setAuth(nextAuth);
  }
  function logout() {
    localStorage.removeItem('lms-auth');
    setAuth(null);
    navigate('/');
  }

  if (!auth) return <AuthPage onAuthenticated={authenticated} />;
  return <div className="app-shell">
    <aside className="sidebar">
      <div className="brand"><span className="brand-badge">LMS</span><div><strong>Life Management System</strong><small>{auth.email}</small></div></div>
      <nav className="nav">{pages.map(([to, label]) => <NavLink key={to} to={to} className={({ isActive }) => `nav-link ${isActive ? 'nav-link-active' : ''}`}>{label}</NavLink>)}
        {auth.role === 'ADMIN' && <NavLink to="/admin" className={({ isActive }) => `nav-link ${isActive ? 'nav-link-active' : ''}`}>Administración</NavLink>}
      </nav>
      <button className="logout-button" onClick={logout}>Cerrar sesión</button>
    </aside>
    <main className="content"><Routes>
      <Route path="/" element={<DashboardPage name={auth.fullName} />} />
      {auth.role === 'ADMIN' && <Route path="/admin" element={<section><h1>Administración</h1><p>Sesión administrativa activa para {auth.email}.</p></section>} />}
      {pages.slice(1).map(([path, label]) => <Route key={path} path={path} element={<section><h1>{label}</h1><p>Esta sección estará disponible en la siguiente fase.</p></section>} />)}
    </Routes></main>
  </div>;
}
