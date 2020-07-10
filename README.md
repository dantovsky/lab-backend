
\* * * * * * * * * * * * * * * * * * * * * * * * * * *  
\* UA » Engenharia de Software » Trabalho Recurso    *  
\* Prof: José Maria Fernandes                        *  
\* Aluno: Dante Ferreira Marinho                     *  
\* * * * * * * * * * * * * * * * * * * * * * * * * * *  

![Pipeline DevOps com Jenkins](https://raw.githubusercontent.com/dantovsky/lab-backend/master/print-of-planes.png "Pipeline DevOps com Jenkins")

# Objetivos:
```
A partir do Lab Project implementar um pipeline DevOps com Jenkins tal como no projecto.

A base de implementação já existe, mas precisa:
- adaptá-lo a um pipeline no jenkins
- deploy automático
- integrar testes (e.g. à API REST)
```

O projeto contém três repositórios:

- Backend(this)  
https://github.com/dantovsky/lab-backend

- Frontend  
https://github.com/dantovsky/lab-frontend

- API Test (Aplicação para testar a API fornecida pelo backend)  
https://github.com/dantovsky/lab-api-test

# Requisitos de funcionamento

- Java (openjdk8)
- Maven
- Jenkins
- Docker

# Configuração do Jenkins

Foi criado um job de nome PipelineLab com a seguinte configuração:

Pipeline
    Definition: Pipeline script from SCM
    SCM: Git
    Repositories: https://github.com/dantovsky/lab-backend
    Branch: */master
    Script Path: Jenkinsfile

# Fluxo do Pipeline

1. Obtenção do Jenkinsfile :: O Pipiline inicia pelo download do projeto Git do backend, onde está contido o Jenkinsfile, o ficheiro de configuração que irá orientar todo o Pipeline.  
2. Buildo Backend :: Build do backend: mvn package.  
3. Deploy Backend :: Com base no Dockerfile contigo no folder do backend, faz build de nova imagem e cria um container onde a partir dele faz o deploy do backend.  
4. API Test :: Download from Git, da app que realiza teste à API, seguido da sua execução.  
5. Download Frontend :: get from Git.  
6. Build & Deploy Frontend :: aplicação pronta para demonstação.  

