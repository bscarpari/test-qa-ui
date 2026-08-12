<a name="readme-top"></a>

<img alt="Header" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=180&section=header&text=UI%20Test%20Automation&fontSize=38&fontColor=ffffff&fontAlignY=32&desc=Java%2017%20%C2%B7%20Selenium%20%C2%B7%20JUnit%20%C2%B7%20Allure&descAlignY=52&descSize=16"/>

<h3 align="center">Automated UI testing on a banking web application</h3>

<p align="center">
  <a href="https://www.linkedin.com/in/bscarpari/">
    <img alt="Made by" src="https://img.shields.io/badge/-Bruno%20Scarpari-blue?style=flat-square&logo=Linkedin&logoColor=white">
  </a>

  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/bscarpari/test-qa-ui?style=flat-square">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/bscarpari/test-qa-ui?style=flat-square">

  <a href="https://github.com/bscarpari/test-qa-ui/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/bscarpari/test-qa-ui?style=flat-square">
  </a>

  <img alt="License" src="https://img.shields.io/github/license/bscarpari/test-qa-ui?style=flat-square">
</p>

<p align="center">
  <a href="#-about">About</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-coverage">Coverage</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-getting-started">Getting started</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-reports">Reports</a>
</p>

<img alt="Allure report" width="100%" src="https://raw.githubusercontent.com/bscarpari/test-qa-ui/main/docs/allure-report-preview.png">

---

## 🌐 About

Automated end-to-end UI test suite for [BugBank](https://bugbank.netlify.app/), a demo banking application built to contain realistic defects.

The suite covers the core user journey — account registration, authentication and money transfer between accounts — and publishes results as an **Allure report** with step-level detail.

<sub>Originally solved as a technical challenge.</sub>

---

## 🚀 Technologies

<!-- PLACEHOLDER CRÍTICO: confirmar a ferramenta de UI real do projeto.
     Se for Selenide ou Playwright Java, troque a badge e a linha abaixo. -->
![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-FF4500?style=for-the-badge&logo=qameta&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC0000?style=for-the-badge&logo=java&logoColor=white)

- **Java 17** — language and runtime
- **Selenium** — browser automation and element interaction
- **JUnit** — test lifecycle and assertions
- **Allure** — rich reporting with steps, attachments and execution history
- **Lombok** — boilerplate reduction in page objects and models
- **Maven** — build and test execution

---

## 🧪 Coverage

| Scenario | Description |
|----------|-------------|
| Account registration | Creates a new account and asserts the confirmation feedback |
| Login | Authenticates with the registered credentials and reaches the dashboard |
| Transfer between accounts | Moves funds between two accounts and validates the resulting balance |

<!-- PLACEHOLDER: cenários que valem adicionar — cada um vira uma linha acima.
     - Login com credenciais inválidas → mensagem de erro
     - Registro com e-mail já existente
     - Transferência com saldo insuficiente
     - Transferência para conta inexistente
     BugBank foi construído com bugs propositais: encontrar e cobrir um deles
     é o cenário mais impressionante que você pode adicionar aqui. -->

---

## 💻 Getting started

**Requirements**

| Tool | Version |
|------|---------|
| Java (JDK) | 17 |
| Maven | 3.8+ |
| Allure CLI | [installation guide](https://docs.qameta.io/allure/) |

**1. Clone the repository**

```bash
git clone https://github.com/bscarpari/test-qa-ui.git
cd test-qa-ui
```

**2. Open the project in IntelliJ IDEA**

**3. Set the project SDK to Java 17**

```text
File > Project Structure > Project > Project SDK > 17
```

**4. Run the tests**

Via terminal:

```bash
mvn test
```

Or through the IDE:

```text
Maven panel (right sidebar) > Lifecycle > test
```

---

## 📊 Reports

Run the full suite **before** generating the report — Allure builds it from the results of the last execution.

```bash
allure generate --clean
allure open
```

Requires the Allure CLI installed locally. Follow the [official instructions](https://docs.qameta.io/allure/) if you don't have it.

A sample report from the last run is committed at [`docs/allure-report`](docs/allure-report/index.html) — clone the repo and open its `index.html` locally to browse it (GitHub renders the raw source, not the live page).

---

## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)

---

<p align="center">
  Made with 💜 by <a href="https://www.linkedin.com/in/bscarpari/">Bruno Scarpari</a> ·
  <a href="https://github.com/bscarpari">GitHub</a> ·
  <a href="mailto:bscarpari.dev@gmail.com">Email</a>
</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<img alt="Footer" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=100&section=footer"/>
