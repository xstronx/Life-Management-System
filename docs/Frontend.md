# Frontend

## Propósito

El frontend de LMS será la capa visual e interactiva de la aplicación. Debe permitir al usuario gestionar sus finanzas personales de forma rápida, clara y amigable, con una experiencia responsive y moderna.

## Stack tecnológico

- React
- TypeScript
- Vite
- React Router
- Tailwind CSS

## Objetivos del frontend

- Brindar una experiencia intuitiva para gestionar finanzas
- Facilitar el registro de ingresos, gastos, cuentas y deudas
- Presentar análisis financieros mediante dashboards y filtros
- Proteger rutas y contenido según autenticación
- Mantener diseño limpio, claro y responsive

## Estructura sugerida del proyecto

- src/
  - app/
  - components/
  - features/
  - layouts/
  - pages/
  - routes/
  - services/
  - hooks/
  - utils/
  - styles/

## Principios de UX

- Simplicidad visual
- Formularios mínimos y claros
- Feedback inmediato sobre validaciones
- Consulta rápida a datos relevantes
- Diseño responsive para mobile y desktop
- Estado visible para carga, error y vacío

## Pantallas principales

### Autenticación
- Login
- Registro
- Recuperación de cuenta (si se define en MVP)
- Redirección según estado de sesión

### Dashboard
- Resumen general del usuario
- Saldo total
- Ingresos y gastos del período
- Máxima categoría de gasto
- Movimientos recientes
- Resumen de metas y deudas

### Gestión de cuentas
- Listado de cuentas
- Crear cuenta
- Editar cuenta
- Eliminar o desactivar cuenta
- Balance por cuenta

### Movimientos
- Ingresos
- Gastos
- Historial de movimientos
- Filtros por fecha, cuenta y categoría
- Acciones de edición y eliminación

### Transferencias
- Crear transferencia entre cuentas
- Ver historial de transferencias
- Validación visual de origen y destino

### Deudas
- Listado de deudas
- Crear deuda
- Registrar pago
- Ver saldo pendiente

### Metas de ahorro
- Ver metas del usuario
- Crear meta
- Registrar contribuciones
- Progreso y porcentaje completado

### Compras planificadas
- Crear compra futura
- Reservar dinero hacia la compra
- Seguimiento de fecha objetivo y progreso

### Perfil y configuración
- Datos personales
- Preferencias de perfil
- Configuración de visualización y localización

## Pantallas por fases

### FASE 0-2: Base técnica
- Login
- Registro
- Layout principal
- Autenticación y navegación base

### FASE 3-5: Finanzas básicas
- Dashboard
- Cuentas
- Movimientos
- Ingresos
- Gastos
- Transferencias

### FASE 6-9: Organización y análisis
- Categorías
- Perfil
- Configuración
- Estadísticas
- Resúmenes financieros

### FASE 10-12: Deudas y objetivos
- Deudas
- Metas
- Compras
- Gestión de reservas

### FASE 13-19: Refinamiento
- Reportes visuales
- Dashboard avanzado
- UX refinada
- Preparación para producción

## Componentes clave sugeridos

- Navbar / Sidebar
- Card financiero
- DataTable / lista de registros
- Formulario de ingreso de movimiento
- Selector de cuenta y categoría
- Modal de confirmación
- Widget de resumen financiero
- Gráfico de evolución
- Alertas y banners
- Estado vacío y error

## Manejo de estado

Se recomienda una mezcla de:
- estado local para formularios y componentes simples
- hooks para lógica reutilizable
- context o store para autenticación y preferencias del usuario
- servicio API para consumo de backend

## Seguridad del frontend

- rutas protegidas según sesión
- evitar renderizado de información no autorizada
- validación de formularios antes del envío
- manejo seguro de token y sesión
- sanitización de texto y datos entrantes

## Pruebas de frontend

### Component tests
- renderizado de formularios y cards
- estados vacíos y errores
- navegación básica

### Form tests
- validación de campos obligatorios
- formatos numéricos y de fecha
- guardado de formularios

### Integration tests
- login y logout
- creación de cuenta
- registro de ingreso y gasto
- flujo de transferencia
- creación de meta y deuda

## Criterios de aceptación del frontend

- [ ] La aplicación es responsive
- [ ] La navegación principal funciona correctamente
- [ ] Las pantallas base están presentes y navegables
- [ ] El usuario puede registrar y consultar movimientos
- [ ] El dashboard presenta información útil y legible
- [ ] Los formularios validan correctamente entrada de datos

## Definition of Done

El frontend se dará por terminado cuando:
- las pantallas esenciales del MVP estén implementadas
- exista una navegación coherente
- los flujos principales funcionan con backend real
- la interfaz es legible, usable y responsive
- la experiencia del usuario cumple con la finalidad del sistema

## Riesgos y consideraciones

- Complejidad visual excesiva sin valor funcional
- Formularios demasiado largos y difíciles de usar
- Dashboard sobrecargado de información
- Diferencias de UX entre mobile y desktop
- Menor prioridad al detalle funcional en comparación con la apariencia
