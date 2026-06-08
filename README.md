# Sistema de Gerenciamento para Oficina Mecânica

## Desenvolvido por

* Lucas Gabriel Rozendo da Silva
* Ricardo Francisco Real de Castro Junior

Acadêmicos de Engenharia de Software – ULBRA

---

## Sobre o Projeto

O Sistema de Gerenciamento para Oficina Mecânica foi desenvolvido em Java utilizando Programação Orientada a Objetos (POO) e interface gráfica Swing no Apache NetBeans.

O objetivo do sistema é auxiliar no controle das atividades de uma oficina mecânica, permitindo o gerenciamento de profissionais, veículos, proprietários, agendamentos de serviços e fichas de manutenção.

O projeto foi desenvolvido aplicando conceitos fundamentais de orientação a objetos, estruturas de dados e interfaces gráficas, simulando um ambiente real de gestão automotiva.

---

## Funcionalidades

### Gerenciamento de Profissionais

O sistema permite o cadastro e controle de profissionais da oficina.

#### Mecânicos

* Código
* Nome completo
* Lista de telefones
* Número de certificação
* Área de especialização

#### Atendentes

* Código
* Nome completo
* Lista de telefones
* Senha de acesso

#### Operações disponíveis

* Inserir
* Editar
* Excluir
* Listar
* Cadastro automático de dados de teste

---

### Gerenciamento de Proprietários

Cadastro de clientes da oficina contendo:

* Nome
* CPF
* Telefone

Cada proprietário pode possuir um ou mais veículos cadastrados no sistema.

---

### Gerenciamento de Veículos

Cadastro e controle dos veículos vinculados aos proprietários.

#### Informações cadastradas

* Placa
* Marca
* Modelo
* Ano de fabricação
* Cor
* Proprietário

#### Operações disponíveis

* Inserir
* Editar
* Excluir
* Listar
* Cadastro automático de dados de teste

---

### Gerenciamento de Agendamentos

Permite registrar os serviços agendados para os veículos.

#### Informações do agendamento

* Código
* Data
* Hora
* Tipo de serviço
* Valor orçado
* Veículo associado
* Mecânico responsável

#### Validações implementadas

* Impede cadastro de veículos inexistentes.
* Impede cadastro de mecânicos inexistentes.
* Impede utilização de profissionais que não sejam mecânicos.
* Impede códigos duplicados.
* Impede conflitos de horário para o mesmo veículo.
* Impede conflitos de horário para o mesmo mecânico.

#### Relatórios disponíveis

* Relatório por mecânico.
* Relatório por veículo.
* Relatório por data.
* Exibição geral dos cadastros.
* Cadastro automático de agendamentos de teste.

---

### Gerenciamento de Categorias

As categorias são utilizadas para classificar os reparos realizados nos veículos.

#### Categorias disponíveis

* Motor
* Freios
* Suspensão
* Sistema Elétrico
* Estética Automotiva

#### Operações disponíveis

* Inserir
* Editar
* Excluir
* Listar
* Cadastro automático de categorias de teste

---

### Fichas de Manutenção

Cada veículo pode possuir uma ficha de manutenção contendo diversos reparos realizados.

#### Informações da ficha

* Código da ficha
* Veículo associado
* Lista de reparos

#### Funcionalidades

* Inserção de reparos
* Edição de reparos
* Exclusão de reparos
* Relatório completo da ficha
* Cálculo automático do custo total
* Quantidade total de reparos

---

### Reparos

Cada reparo registrado contém:

* Código
* Nome do serviço
* Data de realização
* Custo
* Relato do problema
* Categoria
* Profissional responsável

---

## Tecnologias Utilizadas

* Java
* Apache NetBeans
* Java Swing
* Collections Framework (ArrayList)
* Programação Orientada a Objetos

---

## Conceitos Aplicados

* Encapsulamento
* Herança
* Polimorfismo
* Classes Abstratas
* Interfaces
* Agregação
* Relacionamento entre classes
* CRUD (Create, Read, Update, Delete)
* Tratamento de Exceções
* Interface Gráfica com Swing

---

## Estrutura do Projeto

```text
classes/
├── Profissional
├── Mecanico
├── Atendente
├── Proprietario
├── Veiculo
├── Agendamento
├── Categoria
├── Reparo
└── FichaManutencao

telas/
├── FormPrincipal
├── CadastroMecanicos
├── CadastroVeiculos
├── CadastroCategorias
├── CadastroFichasManutencao
└── GerenciarAgendamento
```

---

## Objetivo Acadêmico

Este projeto foi desenvolvido com o objetivo de praticar os conceitos de Programação Orientada a Objetos utilizando Java, simulando um sistema real de gerenciamento para oficinas mecânicas e aplicando conceitos vistos durante a disciplina.

---

## Licença

Projeto desenvolvido para fins educacionais e acadêmicos.
