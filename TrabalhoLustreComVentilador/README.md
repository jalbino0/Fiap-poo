# TrabalhoLustreComVentilador

## 📌 Descrição do Projeto

Este projeto foi desenvolvido para modelar um objeto do mundo real: **um lustre de teto com ventilador integrado**, representado pela classe `LustreComVentilador`.

O sistema avalia se o lustre é capaz de **ventilar e iluminar corretamente**, com base na quantidade de pás (hélices) e lâmpadas informadas na estrutura do produto.

---

## 🧱 Classe Principal

### `LustreComVentilador`

### Atributos

* `estrutura : String`
* `tamanho : String`
* `material : String`
* `qtdPas : int`
* `qtdLampadas : int`

A quantidade de pás e lâmpadas é extraída automaticamente da descrição da estrutura.

---

## ⚙️ Regras de Negócio

Para o lustre funcionar corretamente:

* Deve possuir **no mínimo 3 pás** para ventilar.
* Deve possuir **no mínimo 1 lâmpada** para iluminar.

Caso não atenda aos requisitos mínimos, o sistema informa que o lustre não funciona corretamente.

---

## 🔧 Métodos Implementados (com validação)

### `alterarEstrutura(String novaEstrutura) : boolean`

* Altera o atributo `estrutura`.
* Atualiza automaticamente a quantidade de pás e lâmpadas.
* Validação:

  * Não aceita valor `null`.
  * Não aceita string vazia.
  * Deve conter dois números (pás e lâmpadas).
* Retorna `true` se a alteração for válida e realizada.
* Retorna `false` se a alteração for inválida.

### `alterarTamanho(String novoTamanho) : boolean`

* Altera o atributo `tamanho`.
* Validação:

  * Não aceita valor `null`.
  * Não aceita string vazia.
* Retorna `true` se válido.
* Retorna `false` se inválido.

---

## 🧪 Testes Realizados

Na classe `SistemaPrincipal`:

1. São criados dois objetos:

   * **Lustre 1** (válido)
   * **Lustre 2** (inválido)

2. O sistema exibe o estado original dos dois lustres.

3. O Lustre 2 tem sua estrutura alterada para um estado válido.

4. O sistema exibe novamente as informações para demonstrar que o estado do objeto foi modificado corretamente.

---

## 📂 Estrutura do Projeto

```
TrabalhoLustreComVentilador/
│
├── src/
│   ├── br/com/fiapride/model/LustreComVentilador.java
│   └── br/com/fiapride/main/SistemaPrincipal.java
│
├── README.md
└── .gitignore
```

---

## ▶️ Como Executar

1. Abrir o projeto no Eclipse.
2. Executar a classe:

   ```
   br.com.fiapride.main.SistemaPrincipal
   ```
3. Observar no console:

   * Material
   * Tamanho
   * Quantidade de pás
   * Quantidade de lâmpadas
   * Status de funcionamento

---

## 🎯 Objetivo Acadêmico

O projeto demonstra:

* Modelagem de classe em POO
* Alteração de estado de objeto
* Validação com regras de negócio
* Testes com valores válidos e inválidos
* Representação em UML
* Versionamento com Git e GitHub

---
