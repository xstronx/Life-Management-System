# Instalación y entorno local

## Objetivo

Documentar la forma en que el equipo puede levantar el proyecto en entorno local, con claridad para desarrolladores y validación técnica del MVP.

## Requisitos previos

- Git
- Docker
- Docker Compose
- Java JDK compatible con Spring Boot
- Node.js y npm o gestor equivalente para frontend
- PostgreSQL como base de datos de entorno local o dentro de contenedores

## Entornos recomendados

### Development
- Configuración local para desarrollo activo
- Uso de Docker Compose para levantar servicios principales
- Base de datos local o contenida
- Variables de entorno separadas por ambiente

### Testing
- Ambiente para validar pruebas automatizadas
- Base de datos aislada
- Configuración para ejecutar suites de backend y frontend

### Production
- Ambiente seguro y controlado
- Variables de entorno sensibles protegidas
- Acceso restringido
- Observabilidad mínima y monitoreo

## Configuración general

Se recomienda separar la configuración del proyecto por entorno:
- application-dev
- application-test
- application-prod

También es recomendable mantener los secretos fuera del repositorio y en un archivo de entorno seguro.

## Estructura de entorno

### Frontend
- React + TypeScript + Vite
- Servidor de desarrollo local
- Variables de API asignadas a la URL del backend

### Backend
- Spring Boot
- Configuración con PostgreSQL
- JWT configurado para autenticación
- Seguridad aplicada a rutas y recursos

### Base de datos
- PostgreSQL
- Persistencia local o en contenedor
- Schemas y migraciones controladas

## Procedimiento sugerido de instalación

### 1. Clonar el repositorio
Se debe clonar el proyecto desde GitHub siguiendo la guía del README principal del repositorio.

### 2. Preparar configuración de entorno
Definir variables necesarias como:
- conexión a PostgreSQL
- JWT secret
- URLs de front y back
- configuración de CORS
- credenciales y puerto del entorno

### 3. Levantar la base de datos
Para PostgreSQL 17 local, crea la base de datos antes de arrancar el backend:

```sql
CREATE DATABASE lms;
```

Después copia `backend/.env.example` a `backend/.env` y configura `DB_PASSWORD` con la contraseña de tu instalación.

Si ya tenías una base `lms` creada antes de la fase 5, ejecuta una vez el script
`backend/src/main/resources/postgres-migrations/V2__add_roles_and_account_status.sql`
desde pgAdmin o `psql` para añadir las nuevas columnas sin perder datos.

### 4. Configurar backend
Preparar estructura de Spring Boot con propiedades del entorno, seguridad y persistencia.

### 5. Configurar frontend
Integrar React con Vite, Tailwind y el consumo de la API REST.

### 6. Verificar conexión entre servicios
Confirmar que frontend y backend pueden comunicarse correctamente y que la base de datos responde a consultas.

### 7. Ejecutar validaciones básicas
- login
- registro
- creación de cuenta
- ingreso y gasto
- navegación principal

## Variables de entorno recomendadas

- DB_HOST
- DB_PORT
- DB_NAME
- DB_USER
- DB_PASSWORD
- JWT_SECRET
- JWT_EXPIRATION
- FRONTEND_URL
- SERVER_PORT
- CORS_ALLOWED_ORIGINS

El backend usa PostgreSQL 17 por defecto. Las pruebas automatizadas usan una base H2 aislada mediante el perfil `test`.

## Recomendaciones de despliegue local

- Usar contenedores para que la instalación sea reproducible
- Mantener un entorno limpio por proyecto
- No mezclar configuración de producción con desarrollo local
- Documentar cada cambio de entorno para evitar errores de ejecución

## Criterios de instalación

- [ ] El repositorio se clona correctamente
- [ ] La base de datos está disponible
- [ ] El backend se ejecuta sin errores
- [ ] El frontend corre en entorno local
- [ ] La autenticación y la API responden correctamente
- [ ] La conexión entre frontend, backend y base de datos está funcionando

## Definition of Done

La instalación se considera correcta cuando el equipo puede iniciar el proyecto en un entorno local sin pasos ambiguos, con configuración clara y validación básica de funcionamiento.

## Riesgos y consideraciones

- Variables sensibles en archivos compartidos
- Diferencias entre entornos locales y de producción
- Cambios de puertos o configuración entre servicios
- Falta de documentación para ejecutar el proyecto
- Dependencias no claramente definidas
