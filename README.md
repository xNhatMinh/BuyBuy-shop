# 🛒 BuyBuy - E-commerce RESTful API  
A full-featured backend application for an E-commerce platform built with **Spring Boot**, implementing secure user authentication, shopping cart functionality, product management, and order/payment systems.  
## 🌟 Key Features  
- 🔐 **JWT Authentication** – Secure login, role-based access (User, Admin)  
- 🧍 **User Management** – Register, login, update info  
- 📦 **Product Management** – CRUD operations for products and categories  
- 🛒 **Cart System** – Add, remove, and view items in shopping cart  
- 📤 **Order & Payment** – Place orders and simulate payment flow  
- 📮 **Address Handling** – Save and manage multiple addresses  
- 📘 **Swagger Documentation** – Full OpenAPI support for API testing  
- ⚠️ **Global Exception Handling** – Unified error response system  
## 🛠️ Tech Stack  
- **Language**: Java 17  
- **Framework**: Spring Boot  
- **Security**: Spring Security + JWT  
- **Database**: MySQL / H2  
- **Build Tool**: Maven  
- **API Docs**: Swagger (OpenAPI)  
- **ORM**: Spring Data JPA  
- **Lombok**: For reducing boilerplate code  
## 📁 Project Structure (Modular Design)  
```
com.buybuy.project  
├── config             → App & Swagger configuration  
├── controller         → REST API endpoints  
├── exceptions         → Custom exceptions & global handler  
├── model              → JPA entity classes  
├── payload            → DTOs & API responses  
├── repositories       → Spring Data repositories  
├── security  
│   ├── jwt            → JWT token provider & filters  
│   ├── request        → Login/Signup payloads  
│   └── response       → Auth responses  
├── service            → Interfaces for business logic  
├── serviceImpl        → Service implementations  
├── util               → Utility classes  
└── EcommerceApplication.java → Entry point  
```  
## 🚀 Getting Started  
1. Clone the repository  
```bash  
git clone https://github.com/your-username/buybuy-ecommerce.git  
cd buybuy-ecommerce  
```  
2. Build & Run the project  
```bash  
./mvnw spring-boot:run  
```  
3. Access Swagger API Docs  
```
http://localhost:8080/swagger-ui/index.html  
```  
## 📘 API Highlights  
- `POST /api/auth/register` – Register new user  
- `POST /api/auth/login` – Authenticate and receive JWT  
- `GET /api/products` – Browse product list  
- `POST /api/cart/add` – Add item to cart  
- `POST /api/orders` – Place an order  
> All secured routes require JWT in `Authorization: Bearer <token>` header.  
## 👨‍💻 Author  
- Developed by: **Your Full Name**  
- 📫 GitHub: [https://github.com/your-username](https://github.com/your-username)  
- 🔗 LinkedIn: [https://linkedin.com/in/your-profile](https://linkedin.com/in/your-profile)  
## 💡 About This Project  
- Designed and implemented RESTful APIs for full-stack integration  
- Applied best practices for authentication, role-based access control, and modular architecture  
- Gained practical experience in backend development, domain modeling, and clean code principles  
- Easily integrable with any frontend (React, Angular, Vue) or mobile app (Flutter, React Native)  
## 🏁 Future Improvements  
- 🧾 Invoice generation (PDF)  
- 💳 Real payment gateway integration (Stripe, PayPal)  
- 📱 REST to GraphQL support  
- 📦 Docker & CI/CD integration  
