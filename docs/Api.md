# API REST

## Objetivo

La API REST de LMS expondrá los servicios necesarios para gestionar el flujo financiero personal del usuario. Debe ser consistente, segura y fácilmente extensible para incorporar nuevas funcionalidades en el futuro.

## Principios de diseño

- RESTful y clara
- Versionado o estructura estable por módulo
- Respuestas JSON consistentes
- Validación de entrada en backend
- Autorización según usuario autenticado
- Manejo centralizado de errores
- Aislamiento de recursos por usuario

## Base de la API

Ruta base probable:
- /api

## Módulo de autenticación

### Endpoints principales
- POST /api/auth/register
- POST /api/auth/login
- POST /api/auth/logout
- POST /api/auth/refresh
- GET /api/auth/me

### Funcionalidad
- Registro de usuarios
- Login con credenciales
- Generación y validación de JWT
- Consulta del perfil autenticado
- Cierre de sesión y manejo de tokens

## Módulo de usuarios

### Endpoints principales
- GET /api/users/profile
- PUT /api/users/profile
- GET /api/users/preferences
- PUT /api/users/preferences

### Funcionalidad
- Consulta y edición del perfil
- Ajustes personales
- Datos de configuración del usuario

## Módulo de cuentas

### Endpoints principales
- GET /api/accounts
- POST /api/accounts
- GET /api/accounts/{id}
- PUT /api/accounts/{id}
- DELETE /api/accounts/{id}
- GET /api/accounts/{id}/summary

### Funcionalidad
- Crear y administrar cuentas
- Gestionar saldo inicial
- Consultar información por cuenta
- Listar cuentas del usuario autenticado

## Módulo de transacciones

### Endpoints principales
- GET /api/transactions
- POST /api/transactions/income
- POST /api/transactions/expense
- GET /api/transactions/{id}
- PUT /api/transactions/{id}
- DELETE /api/transactions/{id}
- GET /api/transactions/filter

### Funcionalidad
- Registrar ingresos y gastos
- Asignar cuenta, categoría y fecha
- Listar movimientos con filtros
- Actualizar o eliminar registros

## Módulo de categorías

### Endpoints principales
- GET /api/categories
- POST /api/categories
- PUT /api/categories/{id}
- DELETE /api/categories/{id}
- GET /api/categories/types

### Funcionalidad
- Crear categorías por tipo
- Personalizar nombres y clasificación
- Asociar categoría a ingresos o gastos
- Mantener orden y facilidad de uso

## Módulo de transferencias

### Endpoints principales
- GET /api/transfers
- POST /api/transfers
- GET /api/transfers/{id}
- DELETE /api/transfers/{id}

### Funcionalidad
- Mover dinero entre cuentas del mismo usuario
- Guardar el historial de transferencias
- Actualizar el saldo correcto en origen y destino

## Módulo de deudas

### Endpoints principales
- GET /api/debts
- POST /api/debts
- GET /api/debts/{id}
- PUT /api/debts/{id}
- DELETE /api/debts/{id}
- GET /api/debts/{id}/payments
- POST /api/debts/{id}/payments

### Funcionalidad
- Gestionar deudas personales
- Registrar pagos parciales o totales
- Visualizar saldo pendiente
- Mantener historial de obligaciones

## Módulo de metas

### Endpoints principales
- GET /api/goals
- POST /api/goals
- GET /api/goals/{id}
- PUT /api/goals/{id}
- DELETE /api/goals/{id}
- GET /api/goals/{id}/contributions
- POST /api/goals/{id}/contributions

### Funcionalidad
- Crear metas de ahorro
- Registrar aportes
- Calcular porcentaje de cumplimiento
- Consultar evolución del objetivo

## Módulo de compras planificadas

### Endpoints principales
- GET /api/purchases
- POST /api/purchases
- GET /api/purchases/{id}
- PUT /api/purchases/{id}
- DELETE /api/purchases/{id}
- POST /api/purchases/{id}/reserve

### Funcionalidad
- Crear compras futuras
- Reservar dinero para una compra específica
- Ordenar por prioridad o objetivo de compra
- Mantener estado del progreso

## Módulo de dashboard

### Endpoints principales
- GET /api/dashboard/summary
- GET /api/dashboard/accounts
- GET /api/dashboard/transactions/recent
- GET /api/dashboard/financial-health
- GET /api/dashboard/reports

### Funcionalidad
- Visión general de ingresos y gastos
- Saldo total y por cuenta
- Movimientos recientes
- Evolución financiera por período
- Indicadores de salud financiera

## Reglas de API

- Cada recurso debe estar asociado al usuario autenticado
- La validación de permisos debe hacerse en backend
- Los endpoints deben devolver errores estandarizados
- Las fechas y montos deben manejarse con formatos definidos y consistentes
- Los CRUD deben seguir una lógica de negocio clara y no dejar inconsistencias

## Criterios de aceptación de la API

- [ ] Los endpoints principales están definidos por módulo
- [ ] La API valida entrada y permisos
- [ ] La seguridad JWT está aplicada en los endpoints protegidos
- [ ] Los usuarios solo acceden a su información
- [ ] Los movimientos y saldos se actualizan de manera consistente
- [ ] El dashboard obtiene datos agregados sin errores de integridad

## Definition of Done

La API se considerará lista para la fase funcional cuando:
- todos los módulos principales tienen endpoints definidos
- los datos se exponen con estructura clara
- la autenticación y la autorización operan correctamente
- los servicios críticos responden con coherencia de negocio

## Riesgos y consideraciones

- Endpoints demasiado amplios o poco específicos
- Falta de normativas para manejo de errores
- Duplicidad de lógica entre módulos
- Mal uso de categorías y cuentas
- Acceso cruzado entre recursos de usuarios distintos
- Ambigüedad entre transferencia, gasto y movimiento general
