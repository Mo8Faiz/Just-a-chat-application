# 💬 Just a Real-Time Chat Application ⚡

A real-time chat web application built with **Spring Boot**, **WebSockets**, and **HTML/CSS/JavaScript**, featuring a **cool UI**.
  
I made this project to learn about **WebSockets** and try implementing it myleft.

This project demonstrates how to implement bi-directional communication between server and client using **STOMP over WebSockets**.

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


---

## 🖥️ Preview

![Application UI](<img width="1871" height="868" alt="Screenshot 2025-11-03 142158" src="https://github.com/user-attachments/assets/d06a980a-084f-4c48-919b-f8edfab4cb75" />)

---

## How to run

Clone the repo
```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```
   



