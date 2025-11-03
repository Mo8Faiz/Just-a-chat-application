# 💬 Just a Real-Time Chat Application ⚡

A real-time chat web application built with **Spring Boot**, **WebSockets**, and **HTML/CSS/JavaScript**, featuring a **cool UI**.

This project demonstrates how to implement bi-directional communication between server and client using **STOMP over WebSockets**.
  
I made this project to learn about **WebSockets** and try implementing it myleft.

This project helped me learn : 
-💡 **Practical Implementation** | Uses WebSockets + STOMP (real industry tech). 
- 🧱 **Full-Stack Exposure** | Combines Spring Boot backend with JS frontend. 
- 🎨 **UI/UX Flair** | Shows design thinking (cyberpunk theme). 
- ⚙️ **Network & Deployment Skills** | Uses Ngrok & LAN configuration — not just localhost.
- 🧠 **Problem Solving** | Demonstrates understanding of asynchronous communication.

---

## 🚀 Features

✅ Real-time message exchange between multiple users  
✅ WebSocket (STOMP) communication protocol  
✅ Futuristic aesthetics  
✅ Lightweight frontend built with HTML, CSS, and Vanilla JS  
✅ Backend built on **Spring Boot + SockJS + STOMP**  
✅ Local + network access supported (via Ngrok or LAN IP)  

---

## 🧠 Tech Stack

| Layer | Technology Used |
|-------|------------------|
| Frontend | HTML, CSS (Neon/Cyberpunk theme), JavaScript |
| Backend | Spring Boot (Java) |
| Realtime Communication | STOMP, WebSocket, SockJS |
| Deployment/Testing | Ngrok / Local Network |
| Build Tool | Maven |

---

## 🧩 Folder Structure
```
APP/
│
├── .mvn/                             # Maven wrapper folder
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/chat/app/
│   │   │       ├── config/
│   │   │       │   └── WebSocketConfig.java       # WebSocket + STOMP setup
│   │   │       │
│   │   │       ├── controller/
│   │   │       │   └── ChatController.java         # Handles message routing
│   │   │       │
│   │   │       ├── model/
│   │   │       │   └── ChatMessage.java            # Message data model
│   │   │       │
│   │   │       └── AppApplication.java             # Main Spring Boot application
│   │   │
│   │   ├── resources/
│   │   │   ├── static/                            
│   │   │   ├── templates/
│   │   │   │   └── chat.html                      # Chat frontend UI
│   │   │   └── application.properties             
│   │   │
│   │   └── ...
│   │
│   └── test/                                      # (Optional: JUnit tests)
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml                                        
└── README.md
```

---

## 🖥️ Preview

![Application UI](https://github.com/user-attachments/assets/d06a980a-084f-4c48-919b-f8edfab4cb75)


---

# 🚀 How to run

Clone the repo
```bash
git clone https://github.com/Mo8Faiz/Just-a-chat-application.git
cd Just-a-chat-application
```
   
## 🖥️ To run Locally (on a LAN)->

1. **Find your local IP address**

   **Windows**
   ```bash
   ipconfig
   ```
   **MacOS**
   ```bash
   ifconfig
   ```
   Copy your IPv4 address

2. **Edit**
   - Replace :
   ```
   var socket = new SockJS("/chat");
   ```
   - With
   ```
    const socket = new SockJS('http://YOUR_LOCAL_IP:8080/chat');
   ```
   - Save it.

3. **Start up the backend** 
   ```
   ./mvnw spring-boot:run
   ```
   Search this on a browser :
   ```
   http://YOUR_LOCAL_IP:8080/chat
   ```
   
4. **Search this on device connected to same LAN search** 
   ```
   http://YOUR_LOCAL_IP:8080/chat
   ```
   on any broweser you use.

5. **A UI will open up with both Step 3 and Step 4 and both users can chat using this application**.
--
## 🌐 Run globally using ngrok

If you want your friends outside your LAN to join the chat, you can expose your Spring Boot server with Ngrok.

### Install Ngrok

- [Download Ngrok](https://ngrok.com/download/windows) 
- Login and get your Auth Token from your Ngrok Dashboard
- Connect your account:
- ```
  ngrok config add-authtoken YOUR_AUTHTOKEN
  ```
### Start your Spring Boot server

```
./mvnw spring-boot:run
```
### Expose port 8080 using Ngrok 
- Do this on a separate terminal
  ```
  ngrok http 8080
  ```
### Copy the public URL
- ngrok will show something like :
  ```
  Forwarding  https://nonilluminating-apryl-tribunicial.ngrok-free.dev/chat
  ```
### Update chat.html
- Replace
  ```
  var socket = new SockJS("/chat");
  ```
- With
  ```
  const socket = new SockJS('https://nonilluminating-apryl-tribunicial.ngrok-free.dev/chat');
  ```
### Share the Ngrok URL
- Send this link to anyone — they can open the same chat UI from anywhere in the world 🌍:
  ```
  https://nonilluminating-apryl-tribunicial.ngrok-free.dev/chat
  ```
### Enjoy Chatting then

---

# Author

**MD FAIZ**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ffaaiizz/)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:thefaiz202@gmail.com)

