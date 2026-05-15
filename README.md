# 🍔 Sistema de Hamburgueria com Padrões de Projeto

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática de diversos padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema foi evoluindo ao longo das aulas, recebendo novos padrões conforme eram apresentados, resultando em uma aplicação modular, organizada e de fácil manutenção.

---

# 📚 Padrões de Projeto Utilizados

## ✅ Singleton
Responsável por garantir uma única instância da configuração do sistema.

📍 Diagrama:
```text
src/main/singleton/diagrama/diagrama-classe-singleton.png
```

![Singleton](src/main/singleton/diagrama/diagrama-classe-singleton.png)

---

## ✅ Factory Method + Decorator
O Factory Method é responsável pela criação dos hambúrgueres e o Decorator adiciona ingredientes extras dinamicamente.

📍 Diagramas:
```text
src/main/factorymethod/diagrama/diagrama-classe-fac-method+decorator.png
src/main/decorator/diagrama/diagrama-classe-fac-method+decorator.png
```

![Factory Method](src/main/factorymethod/diagrama/diagrama-classe-fac-method+decorator.png)

---

## ✅ Abstract Factory
Responsável pela criação de combos completos da hamburgueria.

📍 Diagrama:
```text
src/main/abstractfactory/diagrama/diagrama-classe-abs-factory.png
```

![Abstract Factory](src/main/abstractfactory/diagrama/diagrama-classe-abs-factory.png)

---

## ✅ Bridge
Separa a abstração do pagamento de sua implementação.

📍 Diagrama:
```text
src/main/bridge/diagrama/diagrama-classe-bridge.png
```

![Bridge](src/main/bridge/diagrama/diagrama-classe-bridge.png)

---

## ✅ Observer
Permite notificar clientes sobre alterações no status dos pedidos.

📍 Diagrama:
```text
src/main/observer/diagrama/diagrama-classe-observer.png
```

![Observer](src/main/observer/diagrama/diagrama-classe-observer.png)

---

## ✅ Strategy
Responsável pelas estratégias de desconto aplicadas aos pedidos.

📍 Diagrama:
```text
src/main/strategy/diagrama/diagrama-classe-strategy.png
```

![Strategy](src/main/strategy/diagrama/diagrama-classe-strategy.png)

---

## ✅ Chain of Responsibility
Realiza o encaminhamento de solicitações entre níveis de atendimento.

📍 Diagrama:
```text
src/main/chain/diagrama/diagrama-classe-chain.png
```

![Chain](src/main/chain/diagrama/diagrama-classe-chain.png)

---

## ✅ Mediator
Centraliza a comunicação entre cliente e cozinha.

📍 Diagrama:
```text
src/main/mediator/diagrama/diagrama-classe-mediator.png
```

![Mediator](src/main/mediator/diagrama/diagrama-classe-mediator.png)

---

## ✅ Template Method
Define um fluxo padrão para processamento de pedidos.

📍 Diagrama:
```text
src/main/templatemethod/diagrama/diagrama-classe-template.png
```

![Template Method](src/main/templatemethod/diagrama/diagrama-classe-template.png)

---

## ✅ Builder
Responsável pela construção de pedidos personalizados.

📍 Diagrama:
```text
src/main/builder/diagrama/diagrama-classe-builder.png
```

![Builder](src/main/builder/diagrama/diagrama-classe-builder.png)

---

## ✅ Facade
Centraliza e simplifica o acesso aos serviços internos da hamburgueria.

📍 Diagrama:
```text
src/main/facade/diagrama/diagrama-classe-facade.png
```

![Facade](src/main/facade/diagrama/diagrama-classe-facade.png)

---

## ✅ Composite
Permite representar produtos individuais e combos compostos.

📍 Diagrama:
```text
src/main/composite/diagrama/diagrama-classe-composite.png
```

![Composite](src/main/composite/diagrama/diagrama-classe-composite.png)

---

## ✅ State
Controla os estados do pedido durante seu fluxo.

### 📌 Diagrama de Classes

📍 Local:
```text
src/main/state/diagrama/classe/diagrama-classe-state.png
```

![State Classe](src/main/state/diagrama/classe/diagrama-classe-state.png)

### 📌 Diagrama de Estados

📍 Local:
```text
src/main/state/diagrama/estado/diagrama-estago-state.png
```

![State Estado](src/main/state/diagrama/estado/diagrama-estago-state.png)

---

## ✅ Memento
Responsável por salvar e restaurar estados anteriores dos pedidos.

📍 Diagrama:
```text
src/main/memento/diagrama/diagrama-classe-memento.png
```

![Memento](src/main/memento/diagrama/diagrama-classe.png)

---

## ✅ Visitor
Permite adicionar operações aos itens do pedido sem modificar suas classes.

📍 Diagrama:
```text
src/main/visitor/diagrama/diagrama-classe-visitor.png
```

![Visitor](src/main/visitor/diagrama/diagrama-classe.png)

---

# 🚀 Como Executar

## ▶️ Executar aplicação

Execute a classe:

```text
src/main/app/Main.java
```

---

## 🧪 Executar testes

```bash
mvn clean test
```

---

# 📁 Estrutura do Projeto

```text
src/
├── main/
│   ├── singleton/
│   ├── factorymethod/
│   ├── decorator/
│   ├── abstractfactory/
│   ├── bridge/
│   ├── observer/
│   ├── strategy/
│   ├── chain/
│   ├── mediator/
│   ├── templatemethod/
│   ├── builder/
│   ├── facade/
│   ├── composite/
│   ├── state/
│   ├── memento/
│   ├── visitor/
│   └── app/
│
└── test/
```

---

# 🧪 Testes

O projeto possui testes automatizados utilizando JUnit 5 para todos os padrões implementados.

---

# 🛠️ Tecnologias Utilizadas

- Java 17
- Maven
- JUnit 5
- PlantUML
- IntelliJ IDEA
