# Jogo de Dados (Game of Chance)

Este projeto implementa o famoso jogo de dados **Craps**, onde os jogadores rolam dois dados e ganham ou perdem dependendo das combinações obtidas. Este README fornece uma visão geral das regras do jogo, como o código foi implementado e como jogá-lo.

---

## 📝 Regras do Jogo

1. **Primeiro lançamento:**
   - **Vitória imediata:** Se a soma dos dados for **7** ou **11**, o jogador vence.
   - **Derrota imediata:** Se a soma dos dados for **2** (Snake Eyes), **3** (Trey) ou **12** (Box Cars), o jogador perde.
   - **Estabelecer um ponto:** Qualquer outro valor (4, 5, 6, 8, 9, 10) define um "ponto" que será usado nos lançamentos subsequentes.

2. **Lançamentos subsequentes:**
   - O jogador continua jogando até:
     - **Vencer:** Se a soma dos dados for igual ao ponto definido.
     - **Perder:** Se a soma dos dados for **7** antes de igualar o ponto.

---

## 📂 Estrutura do Projeto

- **`GameOfChance`**: Contém a lógica principal do jogo, incluindo as regras, lançamento dos dados e controle do fluxo de jogo.
- **`CrapsTest`**: Classe principal que inicializa o jogo e permite ao jogador jogá-lo.

---

## 🧩 Componentes do Jogo

### 1. **Classe `GameOfChance`**
   - **Enums**:
     - `Status`: Representa o estado do jogo (`CONTINUE`, `WOW` (vitória) ou `LOST` (derrota)).
   - **Constantes**:
     - Valores fixos como **SNAKE_EYES** (2), **SEVEN** (7), etc., que definem os resultados importantes.
   - **Métodos**:
     - `play()`: Contém a lógica principal para jogar uma partida.
     - `rollDice()`: Simula o lançamento de dois dados e retorna sua soma.

### 2. **Classe `CrapsTest`**
   - Executa o jogo ao instanciar a classe `GameOfChance` e chamar o método `play()`.

---

## 🎲 Como Jogar

1. **Passo 1:** Compile o código usando `javac`:
   ```bash
   javac GameOfChance.java CrapsTest.java
