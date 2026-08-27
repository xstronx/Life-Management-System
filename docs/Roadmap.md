# Roadmap del proyecto

## Objetivo

Definir la hoja de ruta de desarrollo de LMS para llegar desde la preparación inicial hasta una versión estable y usable del sistema financiero personal.

## Fases del roadmap

| Fase | Nombre | Objetivo principal | Dependencia |
|---|---|---|---|
| FASE 0 | Preparación del proyecto | Definir alcance, stack y estructura base | Ninguna |
| FASE 1 | Configuración del Backend | Preparar Spring Boot y base del API | FASE 0 |
| FASE 2 | Configuración del Frontend | Preparar React, Vite, navegación y estilos | FASE 0 |
| FASE 3 | Base de datos y modelo inicial | Diseñar esquema principal y persistencia base | FASE 1 |
| FASE 4 | Autenticación y usuarios | Registro, login, JWT y usuarios | FASE 1, FASE 3 |
| FASE 5 | Gestión de cuentas | Cuentas, balances y administración | FASE 3, FASE 4 |
| FASE 6 | Ingresos y gastos | Registro de movimientos principales | FASE 5 |
| FASE 7 | Categorías | Clasificación y análisis por tipo | FASE 6 |
| FASE 8 | Transferencias | Movimiento entre cuentas | FASE 5, FASE 6 |
| FASE 9 | Dashboard financiero | Resumen y salud financiera | FASE 6, FASE 7, FASE 8 |
| FASE 10 | Gestión de deudas | Control y pago de obligaciones | FASE 5, FASE 9 |
| FASE 11 | Metas de ahorro | Objetivos y aportes | FASE 5, FASE 9 |
| FASE 12 | Compras planificadas | Presupuesto y reservas | FASE 11 |
| FASE 13 | Estadísticas y reportes | Dashboard analítico y tendencias | FASE 9 |
| FASE 14 | Testing | Validación funcional y regresión | FASE 4 a FASE 13 |
| FASE 15 | Seguridad y hardening | Protección y validación final | FASE 4, FASE 14 |
| FASE 16 | Dockerización | Entorno reproducible con contenedores | FASE 1, FASE 2, FASE 3 |
| FASE 17 | CI/CD | Automatización y validación continua | FASE 14, FASE 15, FASE 16 |
| FASE 18 | Deploy | Publicación en entorno productivo | FASE 16, FASE 17 |
| FASE 19 | Optimización y versión 1.0 | Refinamiento final y lanzamiento estable | FASE 18 |

## Secuencia lógica de desarrollo

1. Preparar el proyecto
2. Crear backend base
3. Crear frontend base
4. Diseñar y crear base de datos
5. Autenticar usuarios
6. Gestionar cuentas
7. Registrar movimientos
8. Organizar categorías
9. Añadir transferencias
10. Preparar dashboard y reportes básicos
11. Gestionar deudas y metas
12. Planeación de compras
13. Validar estadísticas y análisis
14. Mejorar calidad y seguridad
15. Preparar entorno con Docker
16. Automatizar validación con CI/CD
17. Desplegar productivamente
18. Mejorar y estabilizar versión 1.0

## Entregables por fase

Cada fase debe entregarse con:
- objetivo definido
- tareas priorizadas
- criterios de aceptación
- pruebas necesarias
- definición de done
- riesgos y consideraciones

## Versionado sugerido

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

## Criterios del roadmap

- [ ] No se avanza a la siguiente fase sin validar la anterior
- [ ] Cada fase tiene entregables definidos
- [ ] La base técnica está presente antes de la lógica financiera compleja
- [ ] El MVP cumple con la finalidad real del proyecto
- [ ] La seguridad y testing se incorporan antes de producción
- [ ] La versión 1.0 se entrega solo tras validación real

## Riesgos del roadmap

- Definir demasiadas fases sin preparación real
- Avanzar sin pruebas funcionales mínimas
- Concebir funcionalidades complejas antes del MVP
- Desacoplar frontend y backend en la arquitectura
- Dar prioridad a estética sobre estabilidad

## Resultado esperado

El roadmap debe permitir al equipo iniciar con la FASE 0 y avanzar de manera ordenada, verificable y medible, asegurando que cada entrega resuelva un problema real del usuario y deje una base sólida para el crecimiento del sistema.
