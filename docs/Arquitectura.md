# Arquitectura del sistema

## Visión general

Life Management System (LMS) se plantea como una aplicación web para la gestión financiera personal con una arquitectura modular y extensible. El objetivo principal es separar claramente la experiencia de usuario, la lógica de negocio y la persistencia para facilitar mantenimiento, pruebas y evolución futura.

La arquitectura propuesta es la siguiente:

Frontend
↓
API REST
↓
Backend
↓
PostgreSQL

## Capa Frontend

Tecnologías previstas:
- React
- TypeScript
- Vite
- React Router
- Tailwind CSS

Responsabilidades:
- Renderizar pantallas y componentes reutilizables
- Validar formularios y feedback visual
- Consumir la API REST
- Gestionar navegación por rutas protegidas
- Mostrar dashboards, reportes y listados financieros

Consideraciones:
- Diseño responsive para mobile, tablet y desktop
- Separación entre vistas, componentes y servicios
- Rutas públicas y privadas
- Manejo claro de carga, error y estado vacío

## Capa API REST

Tecnologías previstas:
- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA

Responsabilidades:
- Exponer endpoints REST para cada dominio funcional
- Validar entrada y permisos del usuario
- Centralizar reglas de negocio
- Orquestar acceso a servicios y repositorios
- Servir respuestas consistentes a frontend

Patrones recomendados:
- DTOs para entrada y salida
- Servicios por dominio funcional
- Controladores ligeros
- Manejadores globales de errores
- Seguridad basada en tokens JWT

## Capa Backend

La lógica del negocio se organizará por módulos funcionales, como:
- Autenticación y usuarios
- Cuentas
- Transacciones
- Categorías
- Transferencias
- Deudas
- Metas
- Compras planificadas
- Dashboard y reportes
- Configuración y perfil

Cada módulo debe tener una estructura clara:
- Controller
- Service
- Repository
- Entity
- DTOs
- Mapper / Transformer
- Validaciones

## Capa de persistencia

Tecnología prevista:
- PostgreSQL

Funciones:
- Almacenar usuarios, cuentas, movimientos, deudas y metas
- Mantener integridad referencial entre datos
- Soportar consultas de agregación para dashboard y reportes
- Asegurar consistencia de saldos, contribuciones y pagos

## Principios de arquitectura

### Modularidad
Cada dominio funcional debe vivir en un módulo o paquete separado para reducir acoplamientos.

### Seguridad por capa
La seguridad no debe depender solo de frontend. Debe aplicarse en backend, especialmente en:
- manejo de JWT
- validación de permisos por recurso
- validación de entrada
- protección de rutas y endpoints

### Evolución incremental
La arquitectura debe permitir crecer hacia funciones adicionales sin romper el MVP:
- recordatorios
- múltiples monedas
- exportación de reportes
- analítica más avanzada
- IA como fase posterior

### Escalabilidad
El diseño debe soportar:
- más usuarios
- más movimientos
- más reportes
- nuevas entidades de gestión personal

## Módulos del sistema

### 1. Autenticación y usuarios
- Registro
- Login
- Refresh token o sesión segura
- Perfil del usuario
- Preferencias y configuración

### 2. Finanzas básicas
- Cuentas bancarias y de efectivo
- Ingresos
- Gastos
- Categorías
- Transferencias internas

### 3. Deudas y obligaciones
- Registro de deudas
- Pagos parciales
- Estado pendiente
- Resumen de obligaciones financieras

### 4. Metas y objetivos
- Crear metas de ahorro
- Registro de aportes
- Seguimiento de progreso
- Alertas o indicadores de avance

### 5. Compras planificadas
- Compra futura con fecha objetivo
- Presupuesto y reserva
- Estado de avance para compra

### 6. Dashboard y reportes
- Saldo general
- ingresos vs gastos
- movimientos recientes
- categoría más representativa
- evolución mensual

### 7. Administración y configuración
- Preferencias del usuario
- Preferencias de visualización
- Configuración regional
- Configuración de notificaciones futuras

## Consideraciones técnicas

- El modelo de dominio debe revisarse antes de la implementación final.
- Las relaciones entre cuentas, transacciones y usuarios deben ser claras y consistentes.
- Es importante distinguir correctamente entre:
  - ingreso vs gasto
  - deuda vs gasto recurrente
  - transferencia vs movimiento normal
  - meta vs compra planificada

## Resultado esperado de la arquitectura

La arquitectura debe permitir:
- desarrollar el MVP en fases ordenadas
- validar cada módulo antes de continuar
- seguir una estructura modular y limpia
- preparar el proyecto para crecer sin reestructuras complejas

## Criterios de arquitectura

- [ ] Separación clara entre frontend, backend y base de datos
- [ ] Módulos funcionales bien definidos
- [ ] Seguridad aplicada en todas las capas relevantes
- [ ] Persistencia organizada y consistente
- [ ] Estructura fácil de mantener y escalar
- [ ] Base para futuras extensiones del producto
