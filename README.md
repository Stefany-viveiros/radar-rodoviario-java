# Radar Rodoviario 🚔

Projeto em Java que calcula a velocidade de um veiculo com base na frequencia (Efeito Doppler) e classifica infracoes de transito.

## Tecnologia# 🚔 Radar Rodoviário - Sistema de Controle de Velocidade

## 📚 Sobre o projeto

Este projeto foi desenvolvido como uma atividade acadêmica prática da disciplina de Programação Orientada a Objetos (POO) em Java.

O sistema simula um radar eletrônico de trânsito, responsável por calcular a velocidade de um veículo com base em uma frequência recebida e verificar possíveis infrações de trânsito conforme o limite da via.

---

## 🎯 Objetivo

O sistema tem como objetivo:
- Calcular a velocidade de um veículo
- Comparar com o limite da via
- Classificar o tipo de infração (caso exista)
- Exibir um relatório completo no console

---

## ⚙️ Funcionalidades

- Leitura da frequência do veículo
- Leitura do limite de velocidade
- Cálculo da velocidade real
- Cálculo do percentual acima do limite
- Classificação da infração:
  - Dentro do limite
  - Infração média
  - Infração grave
  - Infração gravíssima
- Exibição detalhada do resultado

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Separação de responsabilidades entre classes
- Encapsulamento de lógica em métodos
- Reutilização de código
- Estruturas condicionais (if / else if / else)
- Métodos com retorno
- Entrada de dados com Scanner
- Formatação de saída

---

## 🏗️ Estrutura do projeto


RadarRodoviario/  

│
├── RadarRodoviario.java → Classe principal (interface com usuário)  

├── Radar.java → Classe responsável pela lógica do sistema  



---

## ⚙️ Lógica do sistema

A classe `Radar` é responsável por toda a lógica do cálculo:

- **Cálculo da velocidade:**

velocidade = ((1 / frequência) - 1) * 300


- **Cálculo do percentual acima do limite:**

percentual = ((velocidade - limite) / limite) * 100


- **Classificação da infração:**
- Até o limite → Sem infração
- Até 20% acima → Infração média
- Até 50% acima → Infração grave
- Acima de 50% → Infração gravíssima

---

## 💻 Como executar o projeto

1. Abra o projeto em uma IDE Java (NetBeans, IntelliJ ou Eclipse)
2. Certifique-se de que ambas as classes estão no mesmo pacote:
 `com.mycompany.radarrodoviario`
3. Execute a classe `RadarRodoviario`
4. Insira os valores solicitados

---

## 📌 Exemplo de execução

=========================================
RADAR ELETRONICO - DETRAN  


Digite a frequencia do carro: 120  

Digite o limite de velocidade (km/h): 80  


Velocidade detectada: 95.0 km/h    


Limite da via: 80.0 km/h  


Resultado: Infracao MEDIA (4 pontos) - R$ 130,16  



---

## 👩‍💻 Autora

Projeto desenvolvido para fins acadêmicos na disciplina de Programação Orientada a Objetos (POO), com foco em lógica de programação e orientação a objetos em Java.

---

## 🚀 Tecnologias utilizadas

- Java ☕
- Java
- Maven
- NetBeans

## Funcionalidades
- Calculo de velocidade
- Classificacao de infracoes (Media, Grave, Gravissima)

## Estrutura
- Classe Radar (logica)
- Classe RadarRodoviario (interacao)

## Como executar
1. Abrir no NetBeans
2. Executar o projeto
