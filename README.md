# 🌟 WishList – Jetpack Compose App

A clean and modern **WishList application** built using **Jetpack Compose**, **Room Database**, and **MVVM architecture**.  
The app allows users to **add, edit, view, and delete wishes** with a smooth UI experience.

---

## 📥 Download APK

Try the latest build here:

👉 **[Download APK](https://drive.google.com/file/d/1qFH1t8QNOLNZYuhRyyXgRgUAe18_MWn2/view)**

---

## 🚀 Features

### ✨ Core Functionality
- Add new wishes  
- Edit existing wishes  
- Delete wishes with swipe gesture  
- View all wishes in a clean list  
- Inline validation with Snackbar feedback  
- Auto-fill details while editing

### 🎨 Modern UI (Jetpack Compose)
- Material 3 UI components  
- Compose-based AppBar  
- Floating Action Button for adding wishes  
- Card-based wish items  
- Smooth swipe-to-delete using `SwipeToDismissBox`  

### 🗄️ Local Storage (Room Database)
- Wish entity stored locally  
- Flow-based reactive data  
- Full CRUD support  
- Repository pattern for clean data access  

### 🧱 Architecture
- **MVVM**  
- **ViewModel** with state holders  
- **Room + Repository + ViewModel** pipeline  
- **State hoisting** and `remember` usage  

---

## 🧠 Tech Stack

| Layer | Technology |
|------|------------|
| UI | Jetpack Compose, Material 3 |
| Architecture | MVVM, State Hoisting |
| Database | Room Database, DAO, Flow |
| Language | Kotlin |
| Navigation | Navigation Compose |

---

## 📂 What This App Does

This app acts as a **personal wishlist / notes manager**, allowing the user to keep track of thoughts, ideas, reminders, or goals.

- Each wish contains:
  - ⭐ Title  
  - 📝 Description  

All data stays locally inside the Room DB (`wishlist.db`).

---

## 🛠 How It Works (High-Level)

- `Wish` → Entity  
- `WishDao` → DAO for CRUD operations  
- `WishRepository` → Handles data layer  
- `WishViewModel` → UI logic & Coroutines  
- Screens:
  - `HomeView` – List all wishes + Swipe to delete  
  - `AddEditDetailView` – Add or update a wish  

---

## 🤝 Contributions

Want to improve the app?  
PRs, feature ideas, and enhancements are welcome!

---

## ⭐ Support  
If you like this project, consider giving it a **⭐ on GitHub**!

