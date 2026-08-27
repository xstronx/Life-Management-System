import { NavLink, Route, Routes } from 'react-router-dom';

const navItems = [
  { to: '/', label: 'Dashboard' },
  { to: '/cuentas', label: 'Cuentas' },
  { to: '/movimientos', label: 'Movimientos' },
  { to: '/deudas', label: 'Deudas' },
  { to: '/metas', label: 'Metas' },
  { to: '/compras', label: 'Compras' }
];

function DashboardPage() {
  return (
    <section>
      <h1>Dashboard financiero</h1>
      <div className="cards">
        <article className="card accent-blue">
          <span>Saldo total</span>
          <strong>$ 0.00</strong>
        </article>
        <article className="card accent-green">
          <span>Ingresos</span>
          <strong>$ 0.00</strong>
        </article>
        <article className="card accent-red">
          <span>Gastos</span>
          <strong>$ 0.00</strong>
        </article>
      </div>
    </section>
  );
}

function AccountsPage() {
  return (
    <section>
      <h1>Cuentas</h1>
      <p>Listado inicial de cuentas bancarias y de efectivo.</p>
    </section>
  );
}

function MovementsPage() {
  return (
    <section>
      <h1>Movimientos</h1>
      <p>Ingresos, gastos y transferencias por cuenta.</p>
    </section>
  );
}

function DebtsPage() {
  return (
    <section>
      <h1>Deudas</h1>
      <p>Resumen y pagos pendientes.</p>
    </section>
  );
}

function GoalsPage() {
  return (
    <section>
      <h1>Metas</h1>
      <p>Objetivos de ahorro y progreso.</p>
    </section>
  );
}

function PurchasesPage() {
  return (
    <section>
      <h1>Compras</h1>
      <p>Compras futuras y reservas programadas.</p>
    </section>
  );
}

export default function App() {
  return (
    <div className="app-shell">
      <aside className="sidebar">
        <div className="brand">
          <span className="brand-badge">LMS</span>
          <div>
            <strong>Life Management System</strong>
            <small>Finanzas personales</small>
          </div>
        </div>

        <nav className="nav">
          {navItems.map((item) => (
            <NavLink
              key={item.to}
              to={item.to}
              className={({ isActive }) => `nav-link ${isActive ? 'nav-link-active' : ''}`}
            >
              {item.label}
            </NavLink>
          ))}
        </nav>
      </aside>

      <main className="content">
        <Routes>
          <Route path="/" element={<DashboardPage />} />
          <Route path="/cuentas" element={<AccountsPage />} />
          <Route path="/movimientos" element={<MovementsPage />} />
          <Route path="/deudas" element={<DebtsPage />} />
          <Route path="/metas" element={<GoalsPage />} />
          <Route path="/compras" element={<PurchasesPage />} />
        </Routes>
      </main>
    </div>
  );
}
