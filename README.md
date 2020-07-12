# Jenkins Pipeline e Docker
 
## UA » Engenharia de Software » Trabalho Recurso  
Professor: Doutor José Maria Fernandes  
Aluno: Dante Ferreira Marinho

![Frontend VueJS](https://raw.githubusercontent.com/dantovsky/lab-backend/master/print-of-planes.png "Frontend VueJS")

# Objetivos:
```
A partir do Lab Project implementar um pipeline DevOps com Jenkins tal como no projecto.

A base de implementação já existe, mas precisa:
- adaptá-lo a um pipeline no jenkins
- deploy automático
- integrar testes (e.g. à API REST)
```

O projeto contém três repositórios:

- Backend(this) » Spring Boot   
https://github.com/dantovsky/lab-backend

- Frontend » VueJS  
https://github.com/dantovsky/lab-frontend

- API Test (Aplicação para testar a API fornecida pelo backend) » Spring Boot  
https://github.com/dantovsky/lab-api-test

# Requisitos de funcionamento

- Java (openjdk8)
- Maven
- Jenkins
- Docker
- Linux  
Os comandos no Jenkinsfile foram feitos para o ambiente Unix. Para utilizar no Windows, basta alterar o comando **sh** para **bat**.  
Exemplo de sintaxe:

```
pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true'
            }
        }
    }
}
```

# Configuração do Jenkins

Foi criado um job de nome PipelineLab com a seguinte configuração:

- Pipeline  
    - Definition: Pipeline script from SCM  
    - SCM: Git  
    - Repositories: https://github.com/dantovsky/lab-backend  
    - Branch: */master  
    - Script Path: Jenkinsfile  

# Fluxo do Pipeline

![Pipeline DevOps com Jenkins](https://raw.githubusercontent.com/dantovsky/lab-backend/master/screenshot-pipeline-jenkins.png "Pipeline DevOps com Jenkins")

1. Obtenção do Jenkinsfile :: O Pipiline inicia pelo download do projeto Git do backend, onde está contido o Jenkinsfile, o ficheiro de configuração que irá orientar todo o Pipeline.  
2. Buildo Backend :: Build do backend: Comando **mvn package** para criar a pasta target onde contém o arquivo WAR ou JAR da app.  
3. Deploy Backend :: Com base no Dockerfile contigo no folder do backend, faz build de nova imagem e cria um container em **deamon mode** onde a partir dele faz o deploy do backend.  
4. API Test :: Download from Git, da app que realiza teste à API, seguido da sua execução.  
5. Download Frontend :: Get from Git.  
6. Build & Deploy Frontend :: Faz build da app VueJS em um container Docker com o Node, onde é feito o **npm install** e em seguida inicia a app com **npm run serve** e deixa a aplicação rodando em **daemon mode** ficando pronta para utilização.

# Créditos e Referências


- Contribuição por Helder Paraense  
Colega de grupo do primeiro trabalho (Lab) da disciplina de Engenharia de Software, onde participou da elaboração do backend em Spring Boot.

- API OpenSky  
https://opensky-network.org/  
Plataforma que fornece uma API com dados de vôos, onde estes foram processados pela aplicação backend.

- Ícones  
https://www.flaticon.com
A app VueJS utiliza ícones obtidos em Flaticon.

