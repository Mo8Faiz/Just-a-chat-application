💬 Chat Karo — Real-Time Chat Application

⚡ A futuristic cyberpunk-themed real-time chat app built using Spring Boot, WebSockets, and HTML/CSS/JavaScript.

🚀 Features

🔁 Real-time messaging with WebSocket + STOMP

🌐 Multi-device connectivity (LAN or Ngrok tunneling)

🎨 Cyberpunk UI theme — glowing neon borders, dark mode, and responsive layout

👥 Multi-user chat support

💾 Lightweight backend with Spring Boot WebSocket API

🧩 Tech Stack
Layer	Technology
Frontend	HTML, CSS, JavaScript
Backend	Spring Boot (Java)
Real-time Engine	WebSocket, STOMP, SockJS
Styling	Custom CSS (Cyberpunk Theme)
Deployment (optional)	Ngrok / Render / Railway
⚙️ Setup Instructions
1️⃣ Clone the repository
git clone https://github.com/yourusername/chat-karo.git
cd chat-karo

2️⃣ Start the backend
mvn spring-boot:run


By default, it runs on http://localhost:8080.

3️⃣ Open the frontend

Open chat.html in your browser, or serve it with a simple live server:

npx live-server

4️⃣ (Optional) Make it accessible online

Use Ngrok:

ngrok http 8080

🧠 How It Works

Each user connects to the WebSocket endpoint (/ws).

When a message is sent, it’s broadcast to all connected clients in real time.

The frontend listens via STOMP over SockJS and updates instantly.

Architecture Diagram:

[Client A] ⇄
             \
              → [WebSocket Server] → [Broadcast to All Clients]
             /
[Client B] ⇄

🎨 UI Showcase

Neon cyan glow or neon red theme

Inputs and buttons with glowing edges

Responsive layout suitable for desktop and mobile

🔮 Future Enhancements

🧍‍♂️ User authentication

💬 Private chat rooms

🕹️ Emoji + file sharing

☁️ Persistent chat history using MongoDB or Firebase

👩‍💻 Author

Your Name
🌐 LinkedIn
 | 💻 GitHub
