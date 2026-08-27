# PLAN DE DESARROLLO - Life Management System (LMS)

# 1. Información del proyecto

## Nombre
Life Management System (LMS)

## Descripción
LMS es una aplicación web moderna y responsive orientada a la gestión financiera personal. Su objetivo es permitir al usuario controlar sus ingresos, gastos, cuentas, transferencias, efectivo, deudas, metas de ahorro, compras planificadas y su salud financiera general mediante un dashboard centralizado con indicadores, reportes y evolución histórica.

## Objetivo general
Construir una plataforma financiera personal segura, escalable y fácil de mantener que soporte el manejo integral de finanzas personales, con capacidad de crecimiento hacia una solución más amplia de gestión personal.

## Alcance inicial
El alcance inicial incluye:
- Registro y seguimiento de ingresos
- Registro y clasificación de gastos
- Administración de cuentas bancarias y efectivo
- Transferencias entre cuentas
- Gestión de deudas y pagos
- Metas de ahorro y reservas
- Compras planeadas
- Dashboard financiero
- Estadísticas y reportes básicos
- Seguridad y autenticación de usuarios

El alcance debe mantenerse genérico para permitir cualquier tipo de usuario, no solo casos específicos.

## Stack tecnológico
Frontend:
- React
- TypeScript
- Vite
- React Router
- Tailwind CSS

Backend:
- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA

Base de datos:
- PostgreSQL

Infraestructura:
- Docker
- Docker Compose

Control de versiones:
- Git
- GitHub

Consideración:
El stack propuesto es viable y alineado con la necesidad de un MVP sólido, mantenible y escalable. Si en una etapa posterior aparece una restricción técnica relevante, el stack puede ajustarse con justificación clara.

# 2. Principios de desarrollo

1. Código limpio
- Mantener estructuras simples, legibles y consistentes.
- Nombrado claro para clases, métodos, variables, endpoints y componentes.
- Evitar lógica duplicada y complejidad innecesaria.

2. Seguridad
- Cifrado de contraseñas con algoritmo robusto.
- Uso de JWT para sesiones.
- Protección de endpoints y datos sensibles.
- Validación estricta de entradas.
- Manejo seguro de errores y secretos.

3. Escalabilidad
- Diseñar módulos desacoplados.
- Preparar la arquitectura para sumar nuevas funcionalidades sin degradar el sistema.
- Utilizar patrones reutilizables y servicios bien definidos.

4. Mantenibilidad
- Separación clara entre backend, frontend, modelos e infraestructura.
- Documentación mínima necesaria pero útil.
- Diseño modular y comprensible para nuevos integrantes.

5. Modularidad
- Dividir el sistema por dominios funcionales.
- Mantener servicios y entidades alineadas con casos de uso reales.
- Reducir dependencias cruzadas entre módulos.

6. Testing
- Cobertura mínima en capas críticas.
- Testing unitario, de integración, servicios y front-end.
- Validación de flujos principales antes de pasar a la siguiente fase.

7. Buenas prácticas
- Convenciones de Git y commits.
- Revisión de código.
- Validaciones en capas: frontend, backend y base de datos.
- Observabilidad básica.

8. Desarrollo incremental
- Priorizar funcionalidades esenciales.
- Validar cada fase antes de avanzar.
- Evitar construir “funcionalidades avanzadas” antes de consolidar la base.

# 3. Arquitectura propuesta

La arquitectura general será la siguiente:

Frontend
↓
API REST
↓
Backend
↓
PostgreSQL

## Arquitectura general
- Frontend: aplicación React + TypeScript con Vite y Tailwind para experiencia responsive y moderna.
- API REST: backend en Java con Spring Boot para exponer servicios y lógica del negocio.
- Capa de negocio: servicios, validaciones, autorización y gestión del dominio.
- Persistencia: PostgreSQL como base de datos relacional.
- Infraestructura: Docker Compose para entorno local y despliegue de servicios.

## Principales módulos del sistema
1. Autenticación y usuarios
   - Registro
   - Login
   - Recuperación de cuenta
   - Perfil
   - Roles y permisos

2. Finanzas básicas
   - Cuentas
   - Ingresos
   - Gastos
   - Categorías
   - Transferencias
   - Efectivo

3. Deudas y obligaciones
   - Deudas
   - Pagos
   - Resumen de deuda
   - Proyección de pagos

4. Metas y objetivos
   - Metas de ahorro
   - Reservas y contribuciones
   - Estado de avance

5. Compras planificadas
   - Compra futura
   - Presupuesto y reserva
   - Seguimiento de progreso

6. Dashboard y reportes
   - Totales
   - Flujos
   - Evolución mensual
   - Indicadores financieros

7. Administración y configuración
   - Preferencias
   - Configuración personal
   - Integración de monedas si se requiere en futuro

## Consideración de arquitectura
La solución debe diseñarse con una base modular y extensible para permitir más adelante:
- alertas o recordatorios
- manejo de múltiples monedas
- exportación de reportes
- IA en etapas posteriores
- gestión más completa de vida personal

# 4. Roadmap general

El proyecto se desarrollará en fases pequeñas y verificables para permitir validación continua.

Fases previstas:
- FASE 0 — Preparación del proyecto
- FASE 1 — Configuración del Backend
- FASE 2 — Configuración del Frontend
- FASE 3 — Base de datos y modelo inicial
- FASE 4 — Autenticación y usuarios
- FASE 5 — Gestión de cuentas
- FASE 6 — Ingresos y gastos
- FASE 7 — Categorías
- FASE 8 — Transferencias
- FASE 9 — Dashboard financiero
- FASE 10 — Gestión de deudas
- FASE 11 — Metas de ahorro
- FASE 12 — Compras planificadas
- FASE 13 — Estadísticas y reportes
- FASE 14 — Testing
- FASE 15 — Seguridad y hardening
- FASE 16 — Dockerización
- FASE 17 — CI/CD
- FASE 18 — Deploy
- FASE 19 — Optimización y versión 1.0

La secuencia prioriza:
1. Base técnica
2. Persistencia
3. Autenticación
4. Funcionalidades principales
5. Interfaz
6. Testing
7. Seguridad
8. Infraestructura
9. Deploy
10. Mejoras

# 5. Plan de desarrollo por fases

## FASE 0 — Preparación del proyecto

### Objetivo
Definir la base del proyecto, la estructura de trabajo, los estándares, el alcance y la hoja de ruta inicial antes de comenzar a construir la solución.

### Dependencias
Ninguna directa. Es la fundamentación de todo el resto.

### Tareas
- [ ] Definir el objetivo del producto y su alcance inicial
- [ ] Confirmar stack tecnológico y decisiones técnicas clave
- [ ] Establecer estructura del repositorio
- [ ] Definir convenciones de desarrollo
- [ ] Definir proceso de trabajo colaborativo con GitHub
- [ ] Crear backlog inicial del proyecto

### Subtareas
- Definir usuarios objetivo y casos de uso
- Definir alcance MVP y no MVP
- Definir reglas de negocio iniciales
- Definir criterios de éxito para las fases
- Documentar convenciones de nomenclatura
- Preparar plantilla de issues / tickets / tareas
- Configurar estructura general de carpetas por capas

### Archivos o componentes involucrados
- Documentación del proyecto
- README principal
- Estructura de repositorio
- Plantillas de trabajo
- Guías de contribución
- Documentación de arquitectura inicial

### Resultado esperado
El equipo cuenta con una visión clara del producto, un enfoque técnico definido y una hoja de ruta ejecutable para comenzar a desarrollar.

### Criterios de aceptación
- [ ] El MVP queda definido y documentado
- [ ] El stack técnico queda aprobado
- [ ] La estructura de trabajo está acordada
- [ ] Existe una ruta de desarrollo por fases
- [ ] El equipo entiende el alcance y las prioridades

### Pruebas
- Revisión de alcance
- Validación del backlog
- Verificación de consistencia entre objetivos y stack

### Definition of Done
La fase se considera terminada cuando el equipo tiene un plan operativo claro, una arquitectura general definida y un roadmap validado para comenzar la implementación.

### Riesgos / Consideraciones
- Alcance poco claro
- Decisiones técnicas tomadas sin suficientes criterios
- Carga de trabajo desbalanceada
- Cambios de alcance durante desarrollo sin control

---

## FASE 1 — Configuración del Backend

### Objetivo
Preparar la base técnica del backend con Spring Boot, configuración inicial, estructura de paquetes y ambiente de ejecución.

### Dependencias
- FASE 0 completada

### Tareas
- [ ] Crear proyecto base del backend
- [ ] Configurar Spring Boot
- [ ] Definir estructura modular
- [ ] Configurar variables de entorno
- [ ] Preparar base para seguridad y autenticación
- [ ] Verificar ejecución del servicio

### Subtareas
- Crear proyecto Maven/Gradle según convención
- Configurar JPA, PostgreSQL y propiedades de entorno
- Definir paquetes por dominio
- Crear configuración base de CORS
- Preparar manejo de errores globales
- Establecer estándares de logging

### Archivos o componentes involucrados
- backend/src/main/java
- Configuración de Spring
- application.properties / application.yml
- Configuración global de seguridad
- Middleware para manejo de errores
- Entidades y DTO base

### Resultado esperado
El backend arranca correctamente, está preparado para recibir módulos funcionales y se encuentra listo para integrarse con la base de datos y la capa de autenticación.

### Criterios de aceptación
- [ ] El backend inicia sin errores
- [ ] La aplicación responde en localhost
- [ ] La configuración de entorno está centralizada
- [ ] La estructura modular está definida
- [ ] El manejo de errores está preparado

### Pruebas
- Inicio del servicio
- Verificación de endpoints base
- Validación de conexiones y propiedades
- Pruebas de configuración

### Definition of Done
La fase está terminada cuando el backend se puede ejecutar, está organizado por módulos y prepara el terreno para el desarrollo de autenticación, entidades y servicios.

### Riesgos / Consideraciones
- Configuración inconsistente de entornos
- Dependencias incorrectas o duplicadas
- Falta de estructura modular
- Exposición de secretos en configuración local

---

## FASE 2 — Configuración del Frontend

### Objetivo
Preparar la base del frontend con React, TypeScript, Vite, routing y diseño visual base para la aplicación.

### Dependencias
- FASE 0 completada

### Tareas
- [ ] Crear proyecto frontend con Vite
- [ ] Configurar React + TypeScript
- [ ] Configurar Tailwind CSS
- [ ] Preparar estructura de componentes
- [ ] Definir rutas base
- [ ] Crear layout inicial

### Subtareas
- Configurar alias y estructura de carpetas
- Crear componentes base reutilizables
- Preparar diseño visual inicial
- Definir manejo de estados y contexto
- Preparar integración con API
- Definir layout principal y navegación

### Archivos o componentes involucrados
- frontend/src
- routes/
- components/
- layouts/
- hooks/
- services/
- styles/

### Resultado esperado
La aplicación frontend queda instalada, arrancable y preparada para mostrar pantallas base y consumir la API.

### Criterios de aceptación
- [ ] El proyecto frontend inicia correctamente
- [ ] La navegación base está configurada
- [ ] Tailwind y estilos base están funcionando
- [ ] El layout principal es usable
- [ ] La integración base con API está preparada

### Pruebas
- Arranque del frontend
- Validación de rutas
- Validación visual del layout
- Verificación de compilación

### Definition of Done
La fase se considera terminada cuando la aplicación frontend corre correctamente, la base visual está estable y los módulos funcionales pueden integrarse sin reconfiguración mayor.

### Riesgos / Consideraciones
- Arquitectura de componentes poco escalable
- Estado global mal diseñado
- Falta de soporte responsive
- Configuración de Tailwind defectuosa

---

## FASE 3 — Base de datos y modelo inicial

### Objetivo
Definir la estructura de persistencia inicial y preparar la base de datos relacional para soportar usuarios, finanzas y módulos principales.

### Dependencias
- FASE 1 completada

### Tareas
- [ ] Diseñar esquema de base de datos inicial
- [ ] Definir entidades principales
- [ ] Configurar PostgreSQL
- [ ] Preparar migraciones o esquema base
- [ ] Definir relaciones clave
- [ ] Validar integridad y tipos de datos

### Subtareas
- Identificar entidades: User, Account, Transaction, Category, Transfer, Debt, Goal, Purchase
- Definir relaciones entre usuarios, cuentas y movimientos
- Establecer conceptos de saldo, categoría y tipo de movimiento
- Definir propiedades de auditoría como createdAt, updatedAt
- Diseñar claves foráneas e índices básicos
- Revisar el modelo antes de implementación

### Archivos o componentes involucrados
- backend/src/main/java/.../entity
- backend/src/main/java/.../repository
- migration scripts
- configuración de base de datos
- modelos de dominio

### Resultado esperado
La base de datos soporta el modelo financiero mínimo del sistema y está preparada para las operaciones de autenticación, cuentas, movimientos y metas.

### Criterios de aceptación
- [ ] PostgreSQL está disponible y conectado
- [ ] Las entidades principales están definidas
- [ ] Las relaciones clave están documentadas
- [ ] El esquema básico está creado
- [ ] Existen reglas mínimas de integridad

### Pruebas
- Validación de conexiones
- Pruebas de persistencia
- Comprobación de relaciones
- Verificación de constraint y nullabilidad

### Definition of Done
La fase está terminada cuando el esquema base está disponible, documentado y funcional, con entidades críticas preparadas para la lógica del negocio.

### Riesgos / Consideraciones
- Modelo demasiado rígido o incompleto
- Falta de normalización o relaciones incorrectas
- Cambios de esquema tardíos
- Confusión entre “transaction” y “transfer”

---

## FASE 4 — Autenticación y usuarios

### Objetivo
Permitir que cada usuario pueda registrarse, autenticarse y acceder a sus propios datos de manera segura.

### Dependencias
- FASE 1 completada
- FASE 3 completada

### Tareas
- [x] Definir modelo de usuario
- [x] Implementar registro
- [x] Implementar login
- [x] Configurar JWT
- [x] Definir permisos y autorización
- [x] Crear perfil y gestión de usuario

### Subtareas
- Cifrado de contraseñas
- Generación de tokens JWT
- Validación de credenciales
- Protección de endpoints
- Middleware de autenticación
- Manejo de errores de autenticación

### Archivos o componentes involucrados
- backend security module
- auth controller
- user entity
- token generation/config
- frontend login/register pages
- protected route handling

### Resultado esperado
El usuario puede registrarse, iniciar sesión, mantener su sesión, y acceder únicamente a sus datos.

### Criterios de aceptación
- [x] El registro funciona
- [x] El login devuelve token válido
- [x] Los endpoints protegidos requieren autenticación
- [x] Las credenciales se almacenan de forma segura
- [x] El usuario solo ve su información

### Pruebas
- Unit tests de hashing y JWT
- Integration tests de login y registro
- Pruebas de autorización
- Validación de protección de rutas

### Definition of Done
La fase termina cuando la autenticación está funcional, segura y validada en backend y frontend para el flujo principal.

### Riesgos / Consideraciones
- Errores en manejo de JWT
- Tokens expuestos o mal validados
- Contraseñas no protegidas
- Falla de autorización entre usuarios

---

## FASE 5 — Gestión de cuentas

### Objetivo
Permitir gestionar cuentas financieras del usuario, el efectivo y el balance de cada cuenta.

### Dependencias
- FASE 3 completada
- FASE 4 completada

### Tareas
- [ ] Crear entidad Account
- [ ] Implementar CRUD de cuentas
- [ ] Definir tipos de cuenta
- [ ] Integrar saldo inicial
- [ ] Gestionar cuentas activas/inactivas
- [ ] Relacionar cuentas con usuario

### Subtareas
- Definir tipos de cuenta: bancaria, efectivo, ahorro, crédito, etc.
- Validar saldos y estados de cuenta
- Preparar alias o nombres de cuenta
- Gestionar cierre o eliminación de cuentas
- Visualizar saldos actuales

### Archivos o componentes involucrados
- Account entity, repository, service, controller
- frontend accounts pages
- dashboard balance widgets
- forms de creación/edición

### Resultado esperado
El usuario puede crear, editar y consultar cuentas, con una visión clara del saldo disponible.

### Criterios de aceptación
- [ ] Se pueden crear cuentas
- [ ] Se pueden listar y editar cuentas
- [ ] Se visualiza el saldo asociado
- [ ] La cuenta pertenece al usuario autenticado
- [ ] Los errores de validación son manejados

### Pruebas
- CRUD de cuenta
- Validación de saldo
- Acceso limitado por usuario
- Integración con dashboard base

### Definition of Done
La fase termina cuando la gestión de cuentas funciona de forma consistente y puede servir como base para ingresos, gastos y transferencias.

### Riesgos / Consideraciones
- Confusión entre “efectivo” y “cuenta”
- Saldos inconsistentes si no se valida bien
- Filtros de usuario insuficientes

---

## FASE 6 — Ingresos y gastos

### Objetivo
Registrar movimientos financieros básicos para reflejar la realidad económica del usuario.

### Dependencias
- FASE 3 completada
- FASE 5 completada

### Tareas
- [ ] Definir transacciones de ingreso y gasto
- [ ] Crear modelo de movimientos
- [ ] Implementar registro de ingresos
- [ ] Implementar registro de gastos
- [ ] Validar montos, fechas y cuenta asociada
- [ ] Integrar movimientos con saldo de cuenta

### Subtareas
- Definir tipos de movimiento
- Asociar transacción a cuenta, usuario y categoría
- Establecer reglas para montos negativos/positivos
- Gestionar notas o etiquetas
- Crear listado y filtros de transacciones

### Archivos o componentes involucrados
- Transaction entity
- transaction service/controller
- frontend movements pages
- income and expense forms
- dashboard financieros básicos

### Resultado esperado
El usuario puede registrar ingresos y gastos, ver el historial de movimientos e impactar el balance de sus cuentas.

### Criterios de aceptación
- [ ] Se registran ingresos correctamente
- [ ] Se registran gastos correctamente
- [ ] Los movimientos se asocian a una cuenta válida
- [ ] El historial se consulta por usuario
- [ ] El saldo refleja los cambios

### Pruebas
- Test de creación de ingreso
- Test de creación de gasto
- Validación de monto y cuenta
- Cálculo de saldo actualizado
- Filtros por fecha y categoría

### Definition of Done
La fase está terminada cuando el usuario puede registrar y consultar ingresos y gastos de forma consistente y con persistencia real.

### Riesgos / Consideraciones
- Diferenciar entre movimiento y transferencia
- Falta de soporte de categorías
- Balance incorrecto por transacciones duplicadas
- Fecha y moneda inconsistentes

---

## FASE 7 — Categorías

### Objetivo
Organizar los movimientos y mejorar la trazabilidad financiera mediante clasificación.

### Dependencias
- FASE 6 completada

### Tareas
- [ ] Definir modelo de categorías
- [ ] Crear categorías por defecto
- [ ] Permitir personalización de categorías
- [ ] Asociar categorías a ingresos y gastos
- [ ] Generar vistas por categoría

### Subtareas
- Definir categorías fijas y personalizadas
- Soportar ingreso/gasto por tipo
- Permitir edición y desactivación
- Preparar filtros de análisis por categoría
- Establecer reglas para categorías no eliminadas si ya tienen uso

### Archivos o componentes involucrados
- Category entity and services
- frontend categories admin
- filters and selectors in forms
- reports and dashboard by category

### Resultado esperado
La aplicación puede clasificar gastos e ingresos para facilitar análisis y control financiero.

### Criterios de aceptación
- [ ] Se crean y editan categorías
- [ ] Los movimientos pueden asignarse a categorías
- [ ] Las categorías están asociadas al usuario
- [ ] Los reportes por categoría pueden obtenerse
- [ ] Las categorías por defecto cumplen el uso práctico

### Pruebas
- CRUD de categorías
- Asignación a transacciones
- Validación de duplicados
- Reportes agregados por categoría

### Definition of Done
La fase se considera cerrada cuando categorías pueden administrarse y aplicarse a todos los movimientos relevantes.

### Riesgos / Consideraciones
- Categorías demasiado rígidas
- Ambigüedad entre “tipo” y “categoría”
- Duplicación de categorías
- Impacto en reportes si la categoría cambia

---

## FASE 8 — Transferencias

### Objetivo
Permitir mover dinero entre cuentas para reflejar uso real del efectivo y de la liquidez de cada cuenta.

### Dependencias
- FASE 5 completada
- FASE 6 completada

### Tareas
- [ ] Definir modelo de transferencia
- [ ] Crear transferencia entre cuentas
- [ ] Ajustar saldos en origen y destino
- [ ] Registrar movimientos asociados
- [ ] Mostrar historial de transferencias
- [ ] Validar fondos suficientes y reglas de negocio

### Subtareas
- Definir transferencia interna entre cuentas
- Generar entradas en cada cuenta
- Manejar fechas y comentarios
- Programar validaciones de flujo de dinero
- Considerar transferencias con efectivo si se requiere más adelante

### Archivos o componentes involucrados
- Transfer entity and service
- frontend transfers page
- forms and validation
- account balance logic
- dashboard summaries

### Resultado esperado
El usuario puede mover dinero entre cuentas sin inconsistencias y con historial claro.

### Criterios de aceptación
- [ ] La transferencia afecta cuentas origen y destino
- [ ] Se valida la cuenta de origen y destino
- [ ] Se registra el movimiento en un historial claro
- [ ] El saldo final es consistente
- [ ] La operación está protegida por permisos de usuario

### Pruebas
- Transferencia entre cuentas
- Validación de cuentas inexistentes
- Verificación de saldos
- Historial y auditoría

### Definition of Done
Esta fase se considera terminada cuando las transferencias representan flujos reales y coherentes entre cuentas del usuario.

### Riesgos / Consideraciones
- Duplicidad de movimientos entre cuenta y transferencia
- Problemas de consistencia al actualizar saldos
- Confusión entre gasto fijo y transferencia

---

## FASE 9 — Dashboard financiero

### Objetivo
Diseñar un panel central que permita visualizar el estado financiero del usuario con indicadores clave y tendencias.

### Dependencias
- FASE 5 completada
- FASE 6 completada
- FASE 7 completada
- FASE 8 completada

### Tareas
- [ ] Diseñar dashboard base
- [ ] Mostrar saldo total
- [ ] Mostrar ingresos y gastos del período
- [ ] Mostrar balance por cuenta
- [ ] Mostrar movimientos recientes
- [ ] Mostrar datos financieros clave

### Subtareas
- Definir widgets del dashboard
- Preparar consulta a datos agregados
- Diseñar cards y tablas
- Agregar filtros por fecha y cuenta
- Establecer métricas de salud financiera

### Archivos o componentes involucrados
- frontend dashboard screens
- backend summary queries
- analytics service
- cards, charts, tables
- API module dashboard

### Resultado esperado
El usuario tiene una visión general clara de su situación financiera en un solo lugar.

### Criterios de aceptación
- [ ] Se visualiza saldo total
- [ ] Se muestran ingresos y gastos
- [ ] Se muestran cuentas con saldo
- [ ] Los movimientos recientes son visibles
- [ ] La información corresponde al usuario autenticado

### Pruebas
- Verificación de cálculos
- Revisión de layout responsive
- Validación de filtros
- Pruebas de integridad de totales

### Definition of Done
La fase concluye cuando el dashboard cumple con la función principal de síntesis financiera y sirve como base para reportes y análisis más avanzados.

### Riesgos / Consideraciones
- Agregados calculados incorrectamente
- Demasiados indicadores sin valor
- Carga de consultas complejas
- Datos desactualizados por mala sincronización

---

## FASE 10 — Gestión de deudas

### Objetivo
Administrar obligaciones financieras para controlar la deuda personal de forma clara y responsable.

### Dependencias
- FASE 5 completada
- FASE 6 completada
- FASE 9 completada

### Tareas
- [ ] Definir modelo de deuda
- [ ] Crear deudas y cuotas
- [ ] Registrar pagos de deuda
- [ ] Calcular saldo pendiente
- [ ] Mostrar historial de pagos
- [ ] Integrar deuda al dashboard

### Subtareas
- Definir atributos de deuda: titular, monto, tasa, cuotas, fecha de vencimiento
- Registrar pagos parciales o totales
- Mostrar evolución de deuda
- Validar duplicados e inconsistencias
- Establecer métricas de deuda total

### Archivos o componentes involucrados
- Debt entity and service
- DebtPayment model
- debt pages frontend
- dashboard summary
- reports specific debt

### Resultado esperado
El usuario puede gestionar deudas y pagos con trazabilidad, mejorando la planificación y control de sus obligaciones.

### Criterios de aceptación
- [ ] Se pueden crear deudas
- [ ] Se registran pagos
- [ ] El saldo pendiente se actualiza
- [ ] El historial es visible
- [ ] La información está aislada por usuario

### Pruebas
- Creación de deuda
- Registro de pago
- Actualización del saldo
- Validación de cuotas y plazos
- Dashboard de deuda

### Definition of Done
La fase está terminada cuando la deuda se puede administrar de forma realista y consistente dentro del sistema financiero personal.

### Riesgos / Consideraciones
- Dificultad para manejar intereses y pagos irregulares
- Ambigüedad entre deuda y gasto
- Error en cálculo de saldo pendiente
- Aplicación de pagos a la deuda incorrecta

---

## FASE 11 — Metas de ahorro

### Objetivo
Permitir al usuario planificar metas financieras con objetivos, reservas y seguimiento de avance.

### Dependencias
- FASE 5 completada
- FASE 6 completada
- FASE 9 completada

### Tareas
- [ ] Definir modelo de metas
- [ ] Crear metas de ahorro
- [ ] Registrar aportes
- [ ] Mostrar progreso y porcentaje completado
- [ ] Vincular meta a gastos o reservas
- [ ] Generar alertas o progreso

### Subtareas
- Definir nombre, monto objetivo, fecha estimada, categoría
- Registrar contribuciones y reservas
- Mostrar progreso acumulado
- Identificar metas vencidas o en riesgo
- Almacenar auditoría de aportes

### Archivos o componentes involucrados
- Goal entity and service
- GoalContribution model
- frontend goals pages
- dashboard metrics
- progress bars and analytics

### Resultado esperado
El usuario puede crear metas, reservar dinero hacia ellas y ver cuánto falta para cumplir cada objetivo.

### Criterios de aceptación
- [ ] Se crean metas
- [ ] Se registran contribuciones
- [ ] El progreso del objetivo se actualiza
- [ ] El usuario puede ver faltante y avance
- [ ] La meta se relaciona con el usuario autenticado

### Pruebas
- Cobertura de objetivo
- Registro de contribuciones
- Verificación del estado de cumplimiento
- Integración con dashboard

### Definition of Done
La fase concluye cuando el sistema puede administrar metas con progreso visible y una lógica consistente de ahorro y reserva.

### Riesgos / Consideraciones
- Definir si las metas son “flujos” o “objetivos de ahorro”
- Relación entre meta y cuenta de ahorro
- Confusión con compras planeadas
- Cálculos de avance inconsistentes

---

## FASE 12 — Compras planificadas

### Objetivo
Gestionar compras futuras para que el usuario pueda reservar dinero antes de comprar un bien o servicio.

### Dependencias
- FASE 5 completada
- FASE 6 completada
- FASE 11 completada

### Tareas
- [ ] Definir modelo de compras planificadas
- [ ] Crear compras futuras
- [ ] Registrar reservas
- [ ] Definir fecha objetivo
- [ ] Relacionar compra con presupuesto o meta
- [ ] Mostrar estado de compra

### Subtareas
- Definir compra por nombre, precio objetivo, pago estimado, fecha esperada
- Establecer monto reservado
- Desglosar progreso por ahorro
- Relacionar la compra con una meta o fondo específico
- Mostrar compras próximas o atrasadas

### Archivos o componentes involucrados
- Purchase entity and service
- frontend purchase pages
- savings/reserve logic
- dashboard planning widgets

### Resultado esperado
El usuario puede organizar compras futuras y reservar dinero antes de que ocurran, evitando decisiones impulsivas.

### Criterios de aceptación
- [ ] Se pueden crear compras planificadas
- [ ] Se registra monto reservado
- [ ] El progreso se refleja visualmente
- [ ] La compra tiene fecha objetivo
- [ ] La información pertenece al usuario autenticado

### Pruebas
- Creación de compra
- Registro de reserva
- Verificación de progreso
- Validación de fechas y montos

### Definition of Done
La fase termina cuando compras futuras y reservas pueden gestionarse de forma clara y utilizable desde la interfaz.

### Riesgos / Consideraciones
- Superposición entre compra y meta
- Dificultad para distinguir ahorro real y compra futura
- Falta de priorización de compras
- Filtros incompletos

---

## FASE 13 — Estadísticas y reportes

### Objetivo
Proveer métricas y análisis de la evolución financiera para ayudar al usuario a entender su comportamiento.

### Dependencias
- FASE 6 completada
- FASE 7 completada
- FASE 9 completada
- FASE 10 completada
- FASE 11 completada
- FASE 12 completada

### Tareas
- [ ] Definir reportes básicos
- [ ] Preparar consultas de agregación
- [ ] Crear estadísticas por período
- [ ] Mostrar evolución de ingresos y gastos
- [ ] Generar reportes por categoría y cuenta
- [ ] Preparar exportación o descarga básica

### Subtareas
- Reportes mensual, trimestral y anual
- Comparación entre períodos
- Evolución por categoria
- Estado de deuda y metas
- Visualización de gráficas

### Archivos o componentes involucrados
- statistics service
- report controllers
- charts in frontend
- dashboard analytics
- trend data model

### Resultado esperado
El usuario puede revisar cómo se comporta su situación financiera y tomar decisiones con base en datos.

### Criterios de aceptación
- [ ] Los reportes corresponden a los datos del usuario
- [ ] El sistema entrega tendencias y totales
- [ ] La información se presenta de forma legible
- [ ] Los filtros por fecha y cuenta funcionan
- [ ] Los gráficos o tablas son consistentes

### Pruebas
- Validación de agregaciones
- Verificación de rangos temporales
- Comparación entre reportes
- Validación visual de gráficos

### Definition of Done
La fase queda cerrada cuando el sistema entrega análisis útiles y precisos sobre la evolución financiera, sin inconsistencias críticas.

### Riesgos / Consideraciones
- Consulta pesada y lenta
- Agregaciones incorrectas
- Overload visual en dashboard
- Falta de indicadores clave

---

## FASE 14 — Testing

### Objetivo
Validar que la aplicación cumple con los requisitos funcionales y que cada módulo se comporta de forma consistente.

### Dependencias
- FASE 4 completada
- FASE 6 completada
- FASE 7 completada
- FASE 8 completada
- FASE 9 completada
- FASE 10 completada
- FASE 11 completada
- FASE 12 completada
- FASE 13 completada

### Tareas
- [ ] Definir estrategia de pruebas
- [ ] Crear unit tests backend
- [ ] Crear tests de integración
- [ ] Crear tests de controladores y servicios
- [ ] Crear component tests frontend
- [ ] Crear e2e tests

### Subtareas
- Testing de entidades y servicios
- Testing de autenticación
- Testing de movimientos y cuentas
- Testing de reportes y dashboards
- Testing de formularios y flujos de usuario
- Validación de casos de error

### Archivos o componentes involucrados
- backend test folders
- frontend test folders
- e2e test suite
- CI configuration
- docs de pruebas

### Resultado esperado
El proyecto cuenta con validación automatizada de las funcionalidades principales y sus flujos críticos.

### Criterios de aceptación
- [ ] Se ejecutan pruebas unitarias
- [ ] Se ejecutan pruebas de integración
- [ ] Se ejecutan pruebas de frontend
- [ ] Se ejecutan flujos e2e principales
- [ ] Hay cobertura crítica en módulos esenciales

### Pruebas
- Backend:
  - Unit tests
  - Integration tests
  - Controller tests
  - Service tests
- Frontend:
  - Component tests
  - Form tests
  - Integration tests
- End-to-End:
  - Login
  - Crear cuenta
  - Registrar ingreso
  - Registrar gasto
  - Transferir dinero
  - Crear meta
  - Registrar pago de deuda

### Definition of Done
La fase está terminada cuando los flujos críticos de negocio están automatizados y la aplicación pasa la validación mínima establecida.

### Riesgos / Consideraciones
- Pruebas poco realistas
- Cobertura baja en funcionalidad clave
- Dependencia de entorno complejo
- Fallos intermitentes por datos no aislados

---

## FASE 15 — Seguridad y hardening

### Objetivo
Fortalecer la aplicación para que sea segura, resistente a errores comunes y apta para entornos reales.

### Dependencias
- FASE 4 completada
- FASE 14 completada

### Tareas
- [ ] Reforzar password hashing
- [ ] Validar JWT y autorización
- [ ] Proteger endpoints por rol y propietario
- [ ] Validar inputs y sanitización
- [ ] Revisar CORS y seguridad HTTP
- [ ] Manejar errores de forma segura
- [ ] Proteger datos sensibles

### Subtareas
- Password hashing robusto
- Protección frente a SQL injection con JPA y consultas seguras
- Prevención de XSS en frontend
- CSRF cuando aplique
- Variables de entorno y secretos
- Protección de datos entre usuarios
- Validación de errores sin exposición de datos sensibles

### Archivos o componentes involucrados
- backend security package
- frontend validation layer
- environment configs
- auth filters
- request validation
- API error handlers

### Resultado esperado
El sistema cumple con estándares mínimos de seguridad para un MVP serio y funcional.

### Criterios de aceptación
- [ ] Las contraseñas no se almacenan en texto plano
- [ ] JWT está implementado correctamente
- [ ] Los endpoints protegen acceso por usuario
- [ ] Los inputs se validan
- [ ] Los secretos están fuera del código fuente
- [ ] Los errores no exponen internals del sistema

### Pruebas
- Validación de autenticación
- Pruebas de permisos
- Validación de datos maliciosos
- Revisión de configuración de seguridad

### Definition of Done
La fase se considera cerrada cuando la aplicación realiza validación, autorización y manejo seguro del contenido crítico.

### Riesgos / Consideraciones
- Seguridad superficial
- Dependencias con configuración insegura
- Falta de protección por propiedad de datos
- Errores de validación que abren brechas

---

## FASE 16 — Dockerización

### Objetivo
Preparar el entorno del proyecto para ejecutarse de manera reproducible con contenedores.

### Dependencias
- FASE 1 completada
- FASE 2 completada
- FASE 3 completada

### Tareas
- [ ] Configurar Docker para backend
- [ ] Configurar Docker para frontend
- [ ] Configurar PostgreSQL en contenedor
- [ ] Preparar Docker Compose
- [ ] Definir variables de entorno por servicio
- [ ] Validar despliegue local

### Subtareas
- Servicios del proyecto
- Redes internas
- Volúmenes para PostgreSQL
- Variables y configuración de entorno
- Inicialización de base de datos
- Validación del arranque conjunto

### Archivos o componentes involucrados
- Dockerfile backend
- Dockerfile frontend
- docker-compose.yml
- configuración de red y volúmenes
- entorno base de ejecución

### Resultado esperado
El proyecto puede levantarse en un entorno local con un único comando o flujo de arranque consistente.

### Criterios de aceptación
- [ ] Backend funciona en contenedor
- [ ] Frontend funciona en contenedor
- [ ] PostgreSQL funciona en contenedor
- [ ] Docker Compose levanta el entorno
- [ ] La conexión entre servicios está establecida

### Pruebas
- Inicio local con Docker
- Verificación de red interna
- Validación de conexión a base de datos
- Flujo completo end-to-end local

### Definition of Done
La fase concluye cuando la solución puede ejecutarse de forma consistente y reproducible en ambientes de desarrollo con contenedores.

### Riesgos / Consideraciones
- Configuración de red y puertos
- Dependencias con archivos de entorno
- Persistencia de datos
- Diferencias entre entornos locales y de producción

---

## FASE 17 — CI/CD

### Objetivo
Automatizar validaciones, pruebas y despliegue continuo para mantener calidad y reduciendo errores manuales.

### Dependencias
- FASE 14 completada
- FASE 15 completada
- FASE 16 completada

### Tareas
- [ ] Definir pipeline de integración continua
- [ ] Ejecutar build automático
- [ ] Ejecutar tests automáticos
- [ ] Ejecutar linting y validaciones
- [ ] Preparar pipeline de despliegue
- [ ] Definir criterios de aprobación de cambios

### Subtareas
- GitHub Actions o herramienta equivalente
- Pipelines por branch o pull request
- Validación con tests
- control de calidad y linting
- estrategia para despliegues controlados

### Archivos o componentes involucrados
- workflows de CI
- pipeline de build
- configuración de pruebas
- validación de despliegue
- documentación de procesos

### Resultado esperado
Cada cambio relevante se valida automáticamente y se reduce el riesgo de regresiones.

### Criterios de aceptación
- [ ] El pipeline compila
- [ ] Se ejecutan pruebas automáticas
- [ ] Se aplican validaciones de calidad
- [ ] El flujo de PR está definido
- [ ] Se entiende cómo se despliega la versión correcta

### Pruebas
- Validación al hacer pull request
- Build automático
- ejecución de test suite
- Pipeline de release o staging

### Definition of Done
La fase está terminada cuando existe un flujo automatizado de integración y validación que mejore la confiabilidad del proyecto.

### Riesgos / Consideraciones
- Pipelines demasiado complejos
- Validaciones que bloquean el desarrollo sin siendo necesarias
- Dependencias no estables
- Entornos inconsistentes entre CI y local

---

## FASE 18 — Deploy

### Objetivo
Preparar la aplicación para su publicación en un entorno de producción seguro y disponible.

### Dependencias
- FASE 16 completada
- FASE 17 completada

### Tareas
- [ ] Definir entorno de producción
- [ ] Preparar despliegue frontend
- [ ] Preparar despliegue backend
- [ ] Preparar despliegue de PostgreSQL
- [ ] Configurar variables de entorno de producción
- [ ] Definir monitoreo y observabilidad inicial

### Subtareas
- Elegir infraestructura de despliegue sin asumir proveedor obligatorio
- Configurar entorno de producción para cada servicio
- Seguridad de secretos y certificados
- Health checks
- Logs y métricas básicas
- Backups y recuperación

### Archivos o componentes involucrados
- deployment configs
- production env files
- infraestructura de servicios
- reverse proxy, if applicable
- monitorización y alertas

### Resultado esperado
La aplicación queda desplegada y operativa en un entorno productivo con bases mínimas de sostenibilidad.

### Criterios de aceptación
- [ ] Frontend disponible en producción
- [ ] Backend disponible en producción
- [ ] Base de datos operativa
- [ ] Variables sensibles protegidas
- [ ] La aplicación responde correctamente en entorno productivo

### Pruebas
- Controles de salud
- Validación de autenticación en producción
- Verificación del flujo principal
- Validación de seguridad y configuración

### Definition of Done
La fase concluye cuando la aplicación puede desplegarse y mantenerse en un entorno productivo con un conjunto mínimo de controles de operación.

### Riesgos / Consideraciones
- Infraestructura insuficiente
- Configuración insegura de producción
- Falta de backups
- Congestión o caídas por baja preparación

---

## FASE 19 — Optimización y versión 1.0

### Objetivo
Refinar la aplicación, estabilizarla, corregir defects de calidad y dejarla lista como primera versión estable.

### Dependencias
- FASE 18 completada

### Tareas
- [ ] Revisar performance y UX
- [ ] Corregir bugs críticos
- [ ] Validar flujos clave
- [ ] Revisar documentación y onboarding
- [ ] Consolidar versión 1.0
- [ ] Preparar release y changelog

### Subtareas
- Optimizar queries y visualización
- Revisar experiencia en mobile y desktop
- Reducir complejidad innecesaria
- Mejorar manejo de errores
- Revisar adecuación a objetivos del MVP
- Preparar versionado semántico y release notes

### Archivos o componentes involucrados
- documentación final
- release notes
- ajustes de UI/UX
- backend and frontend refinements
- pipeline de release

### Resultado esperado
Se entrega una versión estable del producto con funcionalidad principal validada y preparada para uso real.

### Criterios de aceptación
- [ ] La aplicación corre sin errores críticos
- [ ] Los flujos principales funcionan
- [ ] Se han atendido las incidencias claves
- [ ] La documentación está actualizada
- [ ] Existe una versión de lanzamiento definida

### Pruebas
- Validación end-to-end final
- Smoke tests
- Revisión de regressions
- Validación de UX y estabilidad

### Definition of Done
La fase termina cuando el producto alcanza una versión estable, usable y documentada, con un conjunto de funcionalidades esenciales que cumplen el propósito del sistema.

### Riesgos / Consideraciones
- Sobre-optimización prematura
- Dejar pendientes críticos para “después”
- Release con fricción operativa
- Pérdida de claridad del propósito del MVP

# 6. PLAN DETALLADO DE CADA FASE

El plan anterior corresponde al detalle por fases del proyecto. Cada una de las fases debe ser desarrollada en secuencia, validándose de manera independiente antes de pasar a la siguiente. La secuencia lógica prioriza la base técnica, luego la persistencia, luego la autenticación, posteriormente las funciones esenciales del sistema y finalmente la mejora, seguridad, despliegue y estabilización.

# 7. BASE DE DATOS

La base de datos debe planificarse con una mirada estratégica, priorizando claridad, integridad y capacidad de ampliación.

## Entidades potenciales
No todas estas entidades serán definitivas, pero se proponen como base inicial para revisión y refinamiento antes de implementación:

- User
- Account
- Transaction
- Category
- Transfer
- Debt
- DebtPayment
- Goal
- GoalContribution
- Purchase
- Wallet / Cash account
- UserPreference
- Configuración general

## Relaciones esperadas
- Un usuario tiene muchas cuentas
- Un usuario tiene muchos movimientos
- Una cuenta pertenece a un usuario
- Un movimiento pertenece a una cuenta y un usuario
- Una categoría pertenece a un usuario y puede clasificarse por tipo
- Una transferencia conecta dos cuentas
- Una deuda pertenece a un usuario y tiene muchos pagos
- Una meta pertenece a un usuario y tiene muchas contribuciones
- Una compra planeada pertenece a un usuario y puede relacionarse con un objetivo o ahorro

## Consideraciones del diseño
- Cada dato debe tener trazabilidad por usuario
- Se debe evitar la exposición de información cruzada entre usuarios
- Deben definirse índices para consultas por usuario, fecha y cuenta
- Se deben considerar estados de cuenta y registros de auditoría
- El modelo debe revisarse con detalle antes de implementación final

## Modelo sugerido de dominio
- User: identidad, credenciales, configuración de perfil
- Account: nombre, tipo, saldo actual, estado, propietario
- Transaction: tipo, monto, fecha, cuenta, categoría, descripción, usuario
- Category: nombre, tipo, usuario
- Transfer: origen, destino, monto, fecha, descripción
- Debt: nombre, monto, saldo pendiente, vencimiento, cuotas
- DebtPayment: deuda, monto pagado, fecha, tipo de pago
- Goal: nombre, monto objetivo, saldo actual, fecha estimada, usuario
- GoalContribution: meta, monto, fecha, tipo de aportación
- Purchase: nombre, precio, monto reservado, fecha objetivo, estado

# 8. API

La API REST debe organizarse por módulos funcionales, con endpoints coherentes y autorización adecuada por usuario.

## Módulo de autenticación
- POST /api/auth/register
- POST /api/auth/login
- POST /api/auth/refresh
- GET /api/auth/me
- POST /api/auth/logout

## Módulo de usuarios
- GET /api/users/profile
- PUT /api/users/profile
- GET /api/users/preferences
- PUT /api/users/preferences

## Módulo de cuentas
- GET /api/accounts
- POST /api/accounts
- GET /api/accounts/{id}
- PUT /api/accounts/{id}
- DELETE /api/accounts/{id}
- GET /api/accounts/{id}/summary

## Módulo de transacciones
- GET /api/transactions
- POST /api/transactions/income
- POST /api/transactions/expense
- GET /api/transactions/{id}
- PUT /api/transactions/{id}
- DELETE /api/transactions/{id}
- GET /api/transactions/filter

## Módulo de categorías
- GET /api/categories
- POST /api/categories
- PUT /api/categories/{id}
- DELETE /api/categories/{id}
- GET /api/categories/types

## Módulo de transferencias
- GET /api/transfers
- POST /api/transfers
- GET /api/transfers/{id}
- DELETE /api/transfers/{id}

## Módulo de deudas
- GET /api/debts
- POST /api/debts
- GET /api/debts/{id}
- PUT /api/debts/{id}
- DELETE /api/debts/{id}
- GET /api/debts/{id}/payments
- POST /api/debts/{id}/payments

## Módulo de metas
- GET /api/goals
- POST /api/goals
- GET /api/goals/{id}
- PUT /api/goals/{id}
- DELETE /api/goals/{id}
- GET /api/goals/{id}/contributions
- POST /api/goals/{id}/contributions

## Módulo de compras
- GET /api/purchases
- POST /api/purchases
- GET /api/purchases/{id}
- PUT /api/purchases/{id}
- DELETE /api/purchases/{id}
- POST /api/purchases/{id}/reserve

## Módulo de dashboard
- GET /api/dashboard/summary
- GET /api/dashboard/accounts
- GET /api/dashboard/transactions/recent
- GET /api/dashboard/financial-health
- GET /api/dashboard/reports

## Principios de diseño API
- RESTful y consistente
- Respuestas JSON con estructura clara
- Códigos HTTP correctos
- Validación de entrada en backend
- Autorización por propiedad de recurso
- Manejo centralizado de errores
- Documentación clara para integradores

# 9. FRONTEND

## Pantallas principales

### Fase 0-2: Base y navegación
- Login
- Registro
- Layout principal
- Sidebar o navegación
- Página de inicio / landing
- Página 404

### Fase 3-5: Financiero base
- Dashboard
- Cuentas
- Movimientos
- Ingresos
- Gastos
- Transferencias

### Fase 6-9: Gestión del usuario y análisis
- Categorías
- Perfil
- Configuración
- Estadísticas
- Resúmenes financieros

### Fase 10-12: Deudas, metas y compras
- Deudas
- Detalle de deuda
- Metas
- Compras
- Reserva de ahorro
- Progreso por objetivo

### Fase 13-19: Refinamiento y producción
- Optimización visual
- Reportes avanzados
- UX refinada
- Responsive final
- Visualización de dashboards

## Organización visual
- Layout general con header, navegación lateral y contenido principal
- Dashboard con widgets
- Formularios con validación clara
- Tablas de movimientos y pagos
- Módulos de configuración personal
- UX enfocada en rapidez y claridad

## Consideraciones frontend
- Diseño responsive para mobile, tablet y desktop
- Accesibilidad básica
- Estados de carga, vacío y error
- Consistencia de componentes
- Formularios simples y predicibles
- Reutilización de componentes

# 10. TESTING

## Estrategia general
Se debe implementar una estrategia de pruebas por capas, con prioridad en flujos críticos.

## Backend
- Unit tests:
  - servicios
  - validadores
  - utilidades
  - DTOs y conversiones
- Integration tests:
  - base de datos real o test container
  - persistencia
  - operaciones CRUD
- Controller tests:
  - endpoints
  - validaciones
  - autorizaciones
  - manejo de errores
- Service tests:
  - lógica de negocio
  - cálculo de saldo
  - validación de transferencias
  - manejo de deudas y metas

## Frontend
- Component tests:
  - rendering
  - props
  - estados vacíos
  - errores visuales
- Form tests:
  - validación
  - envío
  - errores básicos
- Integration tests:
  - flujo de login
  - flujo de cuenta
  - filtros y dashboard

## End-to-End
- Login
- Crear cuenta
- Registrar ingreso
- Registrar gasto
- Transferir dinero
- Crear meta
- Registrar pago de deuda

## Recomendación
- Reforzar primero pruebas de flujo crítico.
- Mantener prueba de regresión sobre módulos principales.
- Usar datos deterministas y aislados por entorno.

# 11. SEGURIDAD

## Planificación de seguridad
- Password hashing:
  - usar algoritmo robusto y moderno
  - no guardar contraseñas sin cifrado
- JWT:
  - emisión, validación y expiración
  - almacenamiento seguro en frontend
  - roles y permisos claros
- Autorización:
  - cada operación debe verificar propiedad del recurso
  - no permitir acceso entre usuarios
- Validación de datos:
  - entrada del cliente
  - validación backend
  - sanitización adecuada
- CORS:
  - restringido a orígenes permitidos
- Protección de endpoints:
  - rutas autenticadas
  - roles y permisos
  - endpoints sensibles protegidos
- Manejo de errores:
  - respuestas estándar
  - sin泄露 información sensible
- Variables de entorno:
  - configuración separada por entorno
  - no valores sensibles en repositorio
- Secretos:
  - almacenamiento seguro
  - evitar hardcoding
- Protección de datos entre usuarios:
  - consultas filtradas por usuario
  - autorización explícita
- SQL Injection:
  - JPA y consultas parametrizadas
  - evitar concatenación manual
- XSS:
  - sanitización de contenido renderizado
  - uso de librerías y validaciones
- CSRF:
  - evaluar según arquitectura frontend/backend
  - aplicar si procede

# 12. GIT Y GITHUB

## Estrategia
### Branches
- main: versión estable
- develop: integración
- feature/*: nuevas funcionalidades
- bugfix/*: correcciones
- hotfix/*: correcciones críticas
- release/*: preparación de versiones

### Commits
Usar Conventional Commits:
- feat:
- fix:
- refactor:
- test:
- docs:
- chore:

Ejemplos:
- feat: add user authentication flow
- fix: correct debt balance calculation
- test: add transfer integration tests
- docs: update project architecture plan

### Pull Requests
- Revisión por al menos un responsable
- Validación de tests y build
- Descripción clara
- Criterios de aceptación asociados
- Sin PRs sin contexto

### Tags
- Versionado por releases
- tags para versiones importantes

### Releases
- Publicar entregables por versión
- usar changelog y notas relevantes

# 13. ENTORNOS

Los entornos deben estar bien diferenciados para evitar problemas entre desarrollo, prueba y producción.

## Development
- Entorno local para construcción y pruebas rápidas
- Uso de Docker Compose para levantar servicios
- Datos locales no productivos
- Configuración orientada a productividad

## Testing
- Entorno de integración y validación
- Ejecución de pruebas automáticas
- Datos representativos, no reales
- Configuración estable para CI

## Production
- Ambiente seguro y controlado
- Variables de entorno específicas
- Acceso limitado
- Logs, backups y monitoreo
- Configuración de seguridad reforzada

# 14. CI/CD

Planificación posterior, no implementación inmediata.

## Objetivos
- Build automático
- Tests automáticos
- Linting
- Validaciones de calidad
- Deploy de forma controlada
- Pipeline robusto para cambios principales

## Elementos a definir
- triggers por push y PR
- pipeline de backend y frontend
- ganancia de cobertura
- validación de contenedores
- despliegue a entorno controlado

# 15. DEPLOY

La fase de despliegue será posterior a la validación funcional y de calidad, no debe asumirse al inicio.

## Servicios a desplegar
- Frontend
- Backend
- PostgreSQL

## Consideraciones
- No fijar proveedor por defecto sin necesidad
- Definir infra para producción, staging y local
- Revisar seguridad, backups y observabilidad
- Definir criterio de estabilidad para publicar

# 16. VERSIONES

Se propone la siguiente estrategia de versionado:

- v0.1 — Base del proyecto
- v0.2 — Autenticación
- v0.3 — Finanzas
- v0.4 — Cuentas
- v0.5 — Deudas
- v0.6 — Metas
- v0.7 — Compras
- v0.8 — Dashboard
- v0.9 — Testing y seguridad
- v1.0 — Primera versión estable

Se puede ajustar según el orden técnico real de implementación, pero la lógica de liberación debe responder a entregables concretos y verificables.

# 17. CHECKLIST GENERAL

- [ ] Preparación
- [ ] Backend
- [ ] Frontend
- [ ] Base de datos
- [ ] Autenticación
- [ ] Cuentas
- [ ] Ingresos
- [ ] Gastos
- [ ] Transferencias
- [ ] Dashboard
- [ ] Deudas
- [ ] Metas
- [ ] Compras
- [ ] Estadísticas
- [ ] Testing
- [ ] Seguridad
- [ ] Docker
- [ ] CI/CD
- [ ] Deploy
- [ ] v1.0

# 18. REGLAS IMPORTANTES

1. El proyecto debe desarrollarse de forma realista y sostenible.
2. No debe dividirse artificialmente en demasiadas tareas pequeñas.
3. No se deben implementar funcionalidades avanzadas antes de tener base funcional.
4. Cada fase debe poder validarse antes de avanzar.
5. La implementación debe seguir el orden lógico:
   - Base técnica
   - Persistencia
   - Autenticación
   - Funcionalidades principales
   - Interfaz
   - Testing
   - Seguridad
   - Infraestructura
   - Deploy
   - Mejoras
6. El MVP debe priorizar utilidad real sobre complejidad.
7. El modelo de base de datos debe revisarse antes de implementación final.
8. El diseño de API y frontend debe estar alineado con la arquitectura del negocio.
9. El sistema debe mantenerse genérico y útil para cualquier usuario.
10. No incluir IA en el MVP; la IA será una fase futura.
11. Todo cambio de alcance debe documentarse y evaluarse antes de implementarse.
12. Las decisiones técnicas deben justificarse con criterio de mantenibilidad y escalabilidad.
13. La seguridad no es opcional: debe incorporarse desde el inicio.
14. La validación y pruebas deben ir junto con el desarrollo.
15. La infraestructura y despliegue deben ser considerados desde la arquitectura, no como una capa arbitraria.
16. La versión 1.0 debe entregar una experiencia útil, estable y clara, no una colección de funcionalidades incompletas.

Checklist maestro final:
- [ ] Aprobado alcance inicial
- [ ] Backend funcional
- [ ] Frontend funcional
- [ ] Base de datos estable
- [ ] Usuarios y autenticación operando
- [ ] Cuentas y movimientos funcionando
- [ ] Deudas, metas y compras implementadas
- [ ] Dashboard y análisis soportados
- [ ] Testing y seguridad validados
- [ ] Infraestructura desplegable
- [ ] Version 1.0 lista para release
