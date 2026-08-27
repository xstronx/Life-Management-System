# Backend

## Propósito

El backend de LMS será la capa encargada de gestionar la lógica de negocio, autenticación, seguridad, persistencia y exposición de servicios a través de una API REST. Debe ser robusto, modular y mantenible para soportar las finanzas personales del usuario y permitir crecimiento posterior.

## Stack tecnológico

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- PostgreSQL
- Docker

## Objetivos del backend

- Exponer servicios REST para usuarios y finanzas
- Validar y proteger los datos del usuario
- Centralizar reglas del negocio
- Persistir información de forma consistente
- Permitir integraciones futuras con módulos adicionales

## Estructura sugerida del proyecto

Un esquema recomendado es el siguiente:

- api/
  - controller/
  - dto/
- domain/
  - entity/
  - service/
  - mapper/
  - validation/
- infrastructure/
  - repository/
  - config/
  - security/
  - exception/
- shared/
  - constants/
  - utils/

## Módulos funcionales sugeridos

### 1. Autenticación y usuarios
- Registro
- Login
- JWT
- Perfil
- Preferencias de usuario
- Seguridad de acceso por propietario del recurso

### 2. Cuentas
- CRUD de cuentas
- Tipos de cuenta
- Saldo actual
- Estado de la cuenta
- Asociación a usuario

### 3. Transacciones
- Gastos
- Ingresos
- Filtros por fechas, cuenta y categoría
- Validación de montos y cuentas
- Asociación con categorías

### 4. Categorías
- Crear categorías por tipo
- Soporte para categorías personalizadas
- Reutilizar categorías para reportes y análisis

### 5. Transferencias
- Transferencias entre cuentas del mismo usuario
- Registro de dos movimientos asociados
- Validación de saldos y cuentas

### 6. Deudas
- Registro de deudas
- Pago de deuda
- Saldo pendiente
- Historial de pagos

### 7. Metas de ahorro
- Meta con objetivo y fecha estimada
- Aportes y contribuciones
- Estado de progreso

### 8. Compras planificadas
- Compra con precio objetivo y fecha esperada
- Reservas y progreso acumulado

### 9. Dashboard y reportes
- Resumen total
- Gastos e ingresos del mes
- Aportes por categoría
- Indicadores financieros clave

## Entidades base sugeridas

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

## Reglas clave de negocio

- Cada usuario solo debe acceder a sus datos
- El saldo de una cuenta debe derivarse de la lógica de movimientos y transferencias
- Los movimientos deben estar asociados a una cuenta válida
- Los pagos de deuda deben impactar adecuadamente el saldo pendiente
- Las metas y compras deben reflejar progreso real sobre aportes y reservas
- Las categorías deben ser consistentes con el tipo de movimiento

## Seguridad

### Autenticación
- Registro seguro de usuarios
- Hashing de contraseñas
- Generación de token JWT
- Expiración y renovación de sesión

### Autorización
- Protección de endpoints por autenticación
- Verificación de recursos por usuario
- Validación de permisos por entidad y acción

### Protección de datos
- Variables de entorno para secretos
- No almacenamiento de credenciales en texto plano
- Validación estricta de entrada
- Manejo controlado de errores
- CORS configurado según necesidad

### Prevención de vulnerabilidades
- Evitar SQL injection con uso de JPA y consultas parametrizadas
- Limitar datos expuestos en errores
- Validar inputs del cliente y del sistema
- Aplicar controles básicos ante XSS y CSRF según contexto

## Persistencia y bases de datos

Se recomienda PostgreSQL como base de datos primaria. El modelo debe revisarse antes de implementar la capa final de entidades y migraciones. Se debe trabajar con:
- integridad referencial
- índices en campos clave
- auditoría básica (createdAt, updatedAt)
- relaciones claras entre entidades

## Manejo de errores

La API debe responder con:
- códigos HTTP adecuados
- mensajes claros para clientes
- errores de validación específicos
- errores de dominio y seguridad controlados

## Testing sugerido para backend

### Unit tests
- validaciones de servicios
- cálculos financieros
- lógica de deudas, metas y transferencias

### Integration tests
- persistencia con PostgreSQL
- transacciones de negocio complejas
- validación de entidades y relaciones

### Controller tests
- endpoints básicos
- errores HTTP
- autenticación y autorización

### Service tests
- creación de cuentas
- movimientos
- pago de deudas
- registro de metas y aportes

## Criterios de aceptación del backend

- [ ] El backend inicia correctamente
- [ ] La API responde a solicitudes básicas
- [ ] La base de datos está conectada y funcionando
- [ ] La seguridad de endpoints está habilitada
- [ ] El registro y login funcionan con JWT
- [ ] Los módulos core del negocio responden correctamente

## Definition of Done

El backend se considerará terminado en la fase correspondiente cuando:
- la aplicación arrancable está configurada
- la API está operativa
- los módulos principales están conectados a la base de datos
- permisos y seguridad se cumplen
- las pruebas críticas pasan

## Riesgos y consideraciones

- Modelo de datos insuficientemente validado
- Lógica financiera mal definida o ambigua
- Seguridad incompleta en endpoints sensibles
- Dependencias entre módulos que aumentan complejidad
- Falta de validación por propietario del recurso
- Confusión entre conceptos clave como deuda, movimiento, transferencia y meta
