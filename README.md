![Logo](banner.jpg)
# SolarMetrics - API em Spring Boot

**SolarMetrics** é uma API desenvolvida para monitoramento e análise de energia solar, fornecendo dados em tempo real sobre sensores, usuários e ocupação de sistemas. A aplicação permite integrar sensores IoT, gerar relatórios e fornecer dados para aplicativos móveis ou dashboards web.

## Funcionalidades

- Integração com sensores IoT
- Endpoints REST para gerenciamento de sensores, usuários e ocupações
- Persistência em banco de dados
- Suporte para execução em containers (Docker)

## Sobre o time

- **Arthur Algate RM:560109**: Responsável pelo banco de dados e Compliance QA.  
- **Carlos Clementino RM:561187**: Responsável pelo desenvolvimento da API em Java Spring Boot e .NET, infraestrutura e práticas de DevOps, e pela integração com dispositivos IoT.  
- **Eder Silva RM:559647**: Responsável pela criação do APP mobile.

## Requisitos

- Docker
- Docker Compose
- Git
- Sistema operacional compatível com os comandos abaixo (ex.: Fedora/CentOS/RHEL com `dnf`)

---

## Como rodar a aplicação (passo a passo)

> As instruções abaixo assumem que você está utilizando **AlmaLinux** como sistema operacional.

### 1) Atualizar o sistema e instalar dependências do Docker

```bash
sudo dnf update
sudo dnf config-manager --add-repo=https://download.docker.com/linux/centos/docker-ce.repo
sudo dnf install docker-ce docker-ce-cli containerd.io
sudo systemctl start docker
sudo systemctl enable docker
```

- Os comandos adicionam o repositório oficial do Docker, instalam o Docker Engine e ativam o serviço para iniciar automaticamente.

### 2) Instalar o Docker Compose

```bash
sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```

- Baixa a versão mais recente do `docker-compose` e torna o binário executável.

### 3) Adicionar seu usuário ao grupo `docker` (opcional, evita usar `sudo` para comandos Docker)

```bash
sudo usermod -aG docker $USER
newgrp docker
```

- `usermod -aG docker $USER` adiciona o usuário atual ao grupo `docker`.
- `newgrp docker` aplica a alteração sem precisar fazer logout/login. Caso prefira, faça logout e login novamente.

### 4) Instalar o Git

```bash
sudo dnf install git -y
```

### 5) Criar pasta e clonar o repositório

```bash
sudo mkdir ./opt
sudo chmod 777 ./opt
cd opt

git clone https://github.com/ARC-ceo/SolarMetrics-DevOps.git
cd SolarMetrics-DevOps
```

- Cria a pasta `opt`, ajusta permissões (você pode optar por permissões mais restritas em produção) e clona o repositório do projeto.

### 6) Executar os containers

```bash
# A partir da pasta do repositório clonado
docker compose up -d
```

- Sobe os serviços definidos no `docker-compose.yml` em modo destacado (`-d`).

---

