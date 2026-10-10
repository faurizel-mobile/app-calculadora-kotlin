# Calculadora Android (Kotlin)

Aplicativo simples de calculadora desenvolvido em Kotlin para Android, com operações básicas de soma, subtração, multiplicação e divisão.

## Objetivo

Este projeto foi criado para servir como exemplo didático de:

- estrutura de um projeto Android com Kotlin;
- uso do Android Studio;
- ligação de elementos da interface (`EditText`, `Button`, `TextView`);
- manipulação de eventos de clique;
- execução de operações matemáticas em app mobile.

## Funcionalidades

- Inserir dois valores numéricos;
- realizar adição;
- realizar subtração;
- realizar multiplicação;
- realizar divisão;
- limpar os campos de entrada;
- exibir o resultado na tela.

## Tecnologias

- Kotlin
- Android SDK
- Gradle
- Material Components
- ConstraintLayout

## Estrutura do projeto

```text
app-calculadora-kotlin/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── br/gov/sp/calculadora/
│   │   │   │       └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   └── values/
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md
```

## Fluxo principal da aplicação

A tela principal contém:

- dois campos para inserir os números;
- quatro botões para as operações matemáticas;
- um botão para limpar os campos;
- um campo de resultado.

A lógica principal está em `MainActivity.kt`:

- busca os elementos da tela via `findViewById(...)`;
- atribui eventos aos botões com `setOnClickListener`; 
- converte os valores digitados em `Double`; 
- executa a operação selecionada;
- atualiza `TextView` com o resultado.

## Como executar o projeto

### Pré-requisitos

Antes de abrir o projeto, certifique-se de que o ambiente está preparado:

1. Instalar o Android Studio.
2. Instalar o JDK recomendado pelo Android Studio.
3. Fazer o download do Android SDK e do SDK do Android para API compatível.
4. Configurar um emulador Android ou conectar um dispositivo físico com depuração ativada.

### Passos para rodar

1. Clone o repositório:

```bash
git clone https://github.com/faurizel-mobile/app-calculadora-kotlin.git
```

2. Abra a pasta do projeto no Android Studio.

3. Aguarde o Gradle sincronizar as dependências.

4. Se aparecer alguma mensagem para instalar componentes do SDK, confirme a instalação.

5. Selecione um emulador ou dispositivo físico.

6. Execute a aplicação com o botão "Run 'app'".

7. Teste as operações:
   - soma;
   - subtração;
   - multiplicação;
   - divisão;
   - limpar.

### Execução via terminal

Também é possível compilar o projeto pelo terminal:

```bash
./gradlew assembleDebug
```

## Preparação da aula

A seguir, está um passo a passo simples para preparar uma aula prática com este app.

### 1. Objetivo da aula

Ensinar conceitos básicos de desenvolvimento Android com Kotlin, mostrando como criar uma interface, relacionar componentes visuais com código e implementar lógica de negócio.

### 2. Conteúdo a ser abordado

- criação de projeto Android;
- estrutura de pastas `src/main`;
- uso de `activity_main.xml` para layout;
- identificação de elementos com `R.id.*`;
- eventos de clique (`setOnClickListener`);
- conversão de texto para número (`toDouble()`);
- atualização da interface (`TextView.text`).

### 3. Sequência sugerida da aula

#### Parte 1 - Apresentação do app (5 a 10 min)

- mostrar a funcionalidade da calculadora;
- explicar o objetivo de cada campo e botão;
- comentar a organização da tela.

#### Parte 2 - Explicação do layout (10 min)

- analisar `activity_main.xml`;
- mostrar onde ficam os campos de entrada;
- explicar a diferença entre `EditText`, `TextView` e `Button`.

#### Parte 3 - Explicação da lógica em Kotlin (15 min)

- abrir `MainActivity.kt`;
- explicar como os elementos são capturados com `findViewById`;
- mostrar a estrutura do método `onCreate`;
- explicar como cada botão dispara uma operação.

#### Parte 4 - Demonstração prática (10 a 15 min)

- executar o app em emulador;
- testar operações com números diferentes;
- verificar comportamento em divisões e valores vazios.

#### Parte 5 - Exercício para os alunos (15 min)

Sugestão de atividade:

- incluir operação de porcentagem;
- criar botão para inverter sinal;
- adicionar validação para campos vazios;
- melhorar a interface com cores e estilos.

### 4. Pontos de discussão em sala

- Como o código identifica cada componente da tela?
- Qual a função do `setOnClickListener`?
- Por que precisamos converter texto em número?
- O que acontece se o usuário digitar um valor inválido?
- Como a aplicação atualiza a tela após o cálculo?

### 5. Dicas para a aula

- usar um emulador com Android 14 ou compatível;
- manter o código simples para facilitar a compreensão;
- focar na lógica e na relação entre layout e código;
- incentivar os alunos a modificarem os textos, o layout e os botões.

## Observações importantes

- Este projeto é uma calculadora funcional simples, pensada para fins didáticos.
- A lógica atual não possui validações avançadas de entrada, o que pode ser implementado como extensão do projeto.
- A divisão por zero ainda pode gerar comportamento que deve ser tratado em versões futuras.

## Possíveis melhorias futuras

- validar campos vazios;
- tratar divisão por zero;
- formatar resultado com duas casas decimais;
- adicionar histórico de cálculos;
- criar uma interface mais moderna com Material Design.

## Autor

Projeto desenvolvido para estudo e uso em aulas de desenvolvimento mobile Android com Kotlin.

## Licença

Este projeto está disponível para uso didático e estudo. Ajuste conforme a necessidade da instituição ou do professor responsável.

---

Se quiser, posso também criar uma versão mais formal para aula universitária, com objetivo, metodologia, cronograma e roteiro de apresentação para o professor.
