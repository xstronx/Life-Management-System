<div align="center">

# 🚀 Life Management System (LMS)

[![Arquitectura](https://img.shields.io/badge/🏛️_Arquitectura-23272D?style=for-the-badge)](./docs/Arquitectura.md)
[![Roadmap](https://img.shields.io/badge/🗺️_Roadmap_Fases-0052CC?style=for-the-badge)](./docs/Roadmap.md)
[![Frontend](https://img.shields.io/badge/💻_Frontend-61DAFB?style=for-the-badge&logo=react&logoColor=black)](./docs/Frontend.md)
[![Backend](https://img.shields.io/badge/⚙️_Backend-339933?style=for-the-badge&logo=nodedotjs&logoColor=white)](./docs/Backend.md)
[![API Docs](https://img.shields.io/badge/📡_API_Docs-000000?style=for-the-badge&logo=swagger)](./docs/Api.md)
[![Instalación](https://img.shields.io/badge/🛠️_Instalacion-FF9900?style=for-the-badge)](./docs/Instalacion.md)

</div>

---

## 📌 Navegación Rápida a la Documentación

* 🏛️ **[Ver Arquitectura y Base de Datos](./docs/Arquitectura.md)**: Estructura general y modelo ER.
* 🗺️ **[Ver Roadmap de Desarrollo (Fases 0 - 19)](./docs/Roadmap.md)**: Plan detallado paso a paso.
* 💻 **[Documentación de Frontend](./docs/Frontend.md)**: Vistas, routing en React y Tailwind CSS.
* ⚙️ **[Documentación de Backend y Seguridad](./docs/Backend.md)**: Configuración Spring Boot, JWT y Testing.
* 📡 **[Especificación de Endpoints API REST](./docs/Api.md)**: Catálogo completo de endpoints.
* 🛠️ **[Guía de Instalación Local con Docker](./docs/Instalacion.md)**: Instrucciones para desplegar en tu equipo.

---

> 📄 *Para consultar el plan general completo en un solo archivo, revisa el [Plan de Desarrollo Original](./planes-de-accion/Plan_Desarrollo.md).*

---

## ▶️ Ejecutar backend con `.env`

1. Ir a la carpeta `backend`.
2. Verificar que exista el archivo `.env` (hay plantilla en `backend/.env.example`).
3. Ejecutar:

```bash
mvn spring-boot:run
```

4. Probar salud del servicio:

```bash
GET http://localhost:8080/api/health
```
