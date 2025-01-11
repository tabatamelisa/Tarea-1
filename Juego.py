import tkinter as tk
import random

class SimpleGame:
    def __init__(self, root):
        self.root = root
        self.root.title("Juego: Haz clic en el botón correcto")

        # Configuración de la ventana
        self.frame = tk.Frame(self.root, padx=20, pady=20)
        self.frame.pack()

        # Puntuación
        self.score = 0
        self.score_label = tk.Label(self.frame, text=f"Puntuación: {self.score}", font=("Arial", 16))
        self.score_label.grid(row=0, column=0, columnspan=3)

        # Botones del juego
        self.buttons = []
        for i in range(3):
            button = tk.Button(self.frame, text="¿Soy yo?", font=("Arial", 14), bg="lightblue", command=lambda i=i: self.check_button(i))
            button.grid(row=1, column=i, padx=10, pady=10)
            self.buttons.append(button)

        # Seleccionar el botón correcto
        self.correct_button = random.randint(0, 2)
        self.update_buttons()

    def update_buttons(self):
        for i, button in enumerate(self.buttons):
            if i == self.correct_button:
                button.config(text="¡Clic aquí!", bg="lightgreen")
            else:
                button.config(text="¿Soy yo?", bg="lightblue")

    def check_button(self, index):
        if index == self.correct_button:
            self.score += 1
            self.correct_button = random.randint(0, 2)
            self.update_buttons()
        else:
            self.score = max(0, self.score - 1)
        self.score_label.config(text=f"Puntuación: {self.score}")

if __name__ == "__main__":
    root = tk.Tk()
    game = SimpleGame(root)
    root.mainloop()
