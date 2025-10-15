Sure — here’s the clean content you can directly copy into your `README.md` file:

---

# 🔄 Circular Queue Data Structure

A **Circular Queue** is a linear data structure that connects the rear and front ends, forming a circle. Unlike a regular queue, when the rear reaches the end, it **wraps around to the beginning** if space is available — eliminating wasted space and improving **memory efficiency** for fixed-size implementations.

---

## 🧠 Concept Overview

A Circular Queue overcomes the limitations of a standard queue where the space at the front of the array remains unused once dequeued.
By connecting the end of the queue back to the front, it efficiently utilizes the array space.

**Key Operations:**

* **Enqueue** → Insert an element at the rear.
* **Dequeue** → Remove an element from the front.
* **Peek / Front** → Retrieve the first element without removing it.
* **IsFull** → Check if the queue is full.
* **IsEmpty** → Check if the queue is empty.

---

## ⚙️ Working Principle

```
   Front → [   ][   ][   ][   ][   ] ← Rear
             ↑                   ↓
             ←––––– Circular ––––→
```

When the rear pointer reaches the end, it loops back to the start if there is free space.

---

## 🧩 Advantages

✅ Efficient utilization of memory
✅ Avoids the “Queue Overflow” issue in fixed-size arrays
✅ Ideal for **buffer management**, **scheduling**, and **stream data handling**

---

## 💻 Example (in C)

```c
#include <stdio.h>
#define SIZE 5

int items[SIZE], front = -1, rear = -1;

int isFull() {
    if ((front == rear + 1) || (front == 0 && rear == SIZE - 1)) return 1;
    return 0;
}

int isEmpty() {
    if (front == -1) return 1;
    return 0;
}

void enQueue(int element) {
    if (isFull())
        printf("Queue is full\n");
    else {
        if (front == -1) front = 0;
        rear = (rear + 1) % SIZE;
        items[rear] = element;
        printf("Inserted → %d\n", element);
    }
}

int deQueue() {
    int element;
    if (isEmpty()) {
        printf("Queue is empty\n");
        return -1;
    } else {
        element = items[front];
        if (front == rear) front = rear = -1;
        else front = (front + 1) % SIZE;
        printf("Deleted → %d\n", element);
        return element;
    }
}
```

---

## 🧾 Example Output

```
Inserted → 10
Inserted → 20
Inserted → 30
Deleted → 10
Inserted → 40
Inserted → 50
Inserted → 60
Queue is full
```

---

## 🚀 Applications

* **CPU Scheduling (Round Robin)**
* **Traffic Signal Systems**
* **Streaming Data Buffers**
* **Resource Management**

---

## 📚 Author

**Syed Muhammad Awais Hashmi**
📘 Computer Science Student
💡 Passionate about Data Structures & Algorithms

---

⭐ *If you like this project, don’t forget to star the repo!* ⭐

---
