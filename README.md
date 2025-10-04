# 🗳️ Modern Voting System

A secure, web-based digital voting platform built with Spring Boot, featuring an authentic Indian government portal design inspired by official websites like ECI, NVSP, and UIDAI.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

## 🌟 Features

### 🔐 Security & Authentication
- **Aadhaar-based Verification**: Secure 12-digit Aadhaar number validation
- **Duplicate Vote Prevention**: One person, one vote principle enforcement
- **Encrypted Data Storage**: Secure handling of voter information
- **Fraud Detection**: Advanced algorithms to prevent fraudulent activities

### 🎨 Government Portal Design
- **Indian Flag Theme**: Saffron, white, and green color scheme
- **Official Government Styling**: Inspired by ECI, NVSP, and UIDAI portals
- **Government Emblem**: Custom emblem design in header
- **Professional Typography**: Clean, accessible fonts

### 📱 User Experience
- **Responsive Design**: Mobile-friendly interface
- **Real-time Results**: Live vote counting and updates
- **Interactive UI**: Hover effects and smooth animations
- **Accessibility Compliant**: Government standards compliance

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Web browser

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/nishirajsingh/Modern-Voting-System.git
   cd Modern-Voting-System
   ```

2. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the application**
   ```
   http://localhost:8080
   ```

## 🏗️ Technology Stack

| Technology | Purpose |
|------------|---------|
| **Java 17** | Backend programming language |
| **Spring Boot 3.2** | Application framework |
| **Thymeleaf** | Server-side template engine |
| **Bootstrap 5** | CSS framework |
| **Maven** | Build tool and dependency management |
| **HTML5/CSS3** | Frontend markup and styling |
| **JavaScript** | Client-side interactivity |

## 📋 System Workflow

### 1. Voter Registration
- Enter personal details (Name, Aadhaar, Address)
- Aadhaar number validation (12-digit format)
- Receive unique Voter ID (NGF format)
- Duplicate registration prevention

### 2. Candidate Management
- Pre-loaded candidate list with major Indian political parties
- Party symbols and information display
- Candidate profile viewing

### 3. Voting Process
- Voter ID verification
- Electronic ballot paper interface
- Single vote per voter enforcement
- Vote confirmation system

### 4. Results Display
- Real-time vote counting
- Live statistics and percentages
- Winner announcement
- Transparent result display

## 🎯 Key Pages

### 🏠 Home Page
- Hero section with quick actions
- Feature showcase
- Statistics dashboard
- Government portal styling

### 📝 Voter Registration
- Secure registration form
- Aadhaar validation
- Privacy assurance
- Success confirmation

### 👥 Candidates
- Interactive candidate list
- Party information
- Expandable candidate details
- Professional table layout

### 🗳️ Voting Interface
- EVM-style ballot paper
- Candidate selection
- Vote confirmation modal
- Security guidelines

### 📊 Results
- Live vote counting
- Winner announcements
- Statistical analysis
- Auto-refresh functionality

## 🔧 Configuration

### Application Properties
```properties
server.port=8080
spring.thymeleaf.cache=false
```

### Security Features
- Input validation and sanitization
- CSRF protection
- Secure session management
- Data encryption

## 🎨 Design System

### Color Palette
- **Saffron**: `#FF9933` (Primary accent)
- **White**: `#FFFFFF` (Background)
- **Green**: `#138808` (Success states)
- **Navy**: `#000080` (Text and headers)

### Typography
- **Primary Font**: Segoe UI, Tahoma, Geneva, Verdana, sans-serif
- **Headings**: Bold weights (600-800)
- **Body Text**: Regular weight (400)

## 📱 Responsive Breakpoints
- **Desktop**: 1200px+
- **Tablet**: 768px - 1199px
- **Mobile**: Below 768px

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Developer

**Nishiraj Singh Panwar**
- Computer Science Student at Parul University
- Full Stack Developer & Software Engineer
- Passionate about web development, automation, cloud computing, and electronics

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nishiraj-singh-panwar/)
[![Portfolio](https://img.shields.io/badge/Portfolio-000000?style=for-the-badge&logo=About.me&logoColor=white)](https://nishiraj.netlify.app)

## 🙏 Acknowledgments

- Election Commission of India for design inspiration
- Indian government digital services for UI/UX patterns
- Bootstrap team for the excellent CSS framework
- Spring Boot community for comprehensive documentation

## 📞 Support

For support, email nishirajsinghpanwar@gmail.com or create an issue in this repository.

---

<div align="center">
  <p><strong>Made with ❤️ for Digital Democracy</strong></p>
  <p>© 2025 Nishiraj Singh Panwar. All rights reserved.</p>
</div>