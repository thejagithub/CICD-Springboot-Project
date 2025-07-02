# 🚀 CI/CD Pipeline for Java Spring Boot Application
![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=spring-boot&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?logo=jenkins&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?logo=kubernetes&logoColor=white)
![Minikube](https://img.shields.io/badge/Minikube-33AADD?logo=kubernetes&logoColor=white)
![ArgoCD](https://img.shields.io/badge/Argo%20CD-FB4466?logo=argo&logoColor=white)
![SonarQube](https://img.shields.io/badge/SonarQube-4E9BCD?logo=sonarqube&logoColor=white)
![Prometheus](https://img.shields.io/badge/Prometheus-E6522C?logo=prometheus&logoColor=white)
![Grafana](https://img.shields.io/badge/Grafana-F46800?logo=grafana&logoColor=white)
![YAML](https://img.shields.io/badge/Config-YAML-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)
![Status](https://img.shields.io/badge/status-Active-brightgreen)


This project sets up a complete CI/CD pipeline for a Java Spring Boot application using Jenkins, SonarQube, and Argo CD. The app is containerized with Docker and deployed on a Kubernetes cluster using Minikube. For observability, Prometheus and Grafana are used to monitor the system. It also includes email notifications after successful builds.

---

![CICD GIF2](https://github.com/user-attachments/assets/07f0f71d-f543-4bc3-8bf9-77233ab44279)


## ⚙️ Tech Stack

| Layer             | Tool/Technology                 |
|------------------|----------------------------------|
| Application       | Java, Spring Boot               |
| CI Tool           | Jenkins                         |
| Code Quality      | SonarQube                       |
| CD Tool           | Argo CD                         |
| Containerization  | Docker                          |
| Orchestration     | Kubernetes (Minikube)           |
| Monitoring        | Prometheus, Grafana             |
| Notifications     | Jenkins Email Extension Plugin  |
| Platform          | AWS EC2 Instance         |
| Version Control   | GitHub                          |

---

## 📁 Project Structure

```bash
CICD-Springboot-Project/
├── JenkinsFile                     # Jenkins pipeline definition
├── dockerfile                      # Dockerfile to build the Spring Boot image
├── manifests/                      # Kubernetes manifests for deployment
│   └── springboot-deployment.yml
├── src/                            # Java source files
├── pom.xml                         # Maven build file
└── ...
```
---
## ✅ Prerequisites
- Before getting started, make sure the following are set up:

- Docker is installed and running

- Minikube cluster is up and running

- kubectl configured to talk to Minikube

- Jenkins installed (locally or on an EC2 instance)

- Argo CD set up and connected to GitHub

- SonarQube server accessible

- Docker Hub account for pushing images

---

## 🧪 How the CI/CD Pipeline Works
### 🧱 CI – Continuous Integration (Jenkins + SonarQube)
- Jenkins fetches the latest code from GitHub.

- Runs unit tests and builds the app using Maven.

- Performs code quality checks using SonarQube.

- Builds and pushes a Docker image to Docker Hub.

- Sends a success email after the build completes.

### 🚀 CD – Continuous Deployment (Argo CD)
- Argo CD automatically detects changes in the GitHub repository.

- Pulls the updated Kubernetes manifests.

- Deploys the new version to the Minikube Kubernetes cluster.

### 📊 Monitoring Setup
- Prometheus collects metrics from the Spring Boot application and Kubernetes.

- Grafana is used to create dashboards and visualize resource usage and application performance.

- You can also view pod status and health metrics in real time.

### 📬 Email Notifications
- Email alerts are configured in Jenkins to notify about the success or failure of each pipeline run.

---

## 📸 Screenshots

![new localhost](https://github.com/user-attachments/assets/eeee102d-ba43-412a-93a8-bbec14ea6f5c)
Application on localhost



![jenkins dashboard](https://github.com/user-attachments/assets/eeb78a9e-d744-47ac-b686-200a7c3f37b6)
Jenkins dashboard



![Jenkins pipeline config](https://github.com/user-attachments/assets/3fb115cb-095e-4028-bb1f-bd841d83ed22)
Pieline configuration



![sonarqube](https://github.com/user-attachments/assets/519d916e-c80f-4eed-9082-9ed96e313859)
Code quality analysis using sonarqube



![Dockerhub](https://github.com/user-attachments/assets/1564b4bb-2fc8-4449-9380-529e636be565)
Images updated on dockerhub



![jenkins success](https://github.com/user-attachments/assets/f3f946c1-6263-4ba2-a49a-d7a6b837d62c)
Jenkins pipeline success



![Argo Success](https://github.com/user-attachments/assets/861cd374-8283-4f46-92cf-2a533d2bdfe7)
ArgoCD deployment success



![Grafana Dashboard](https://github.com/user-attachments/assets/7e7e3815-2d0f-43bc-9082-d405b9b94a4d)
![grafana](https://github.com/user-attachments/assets/53986be2-02cd-4803-b646-a4961b60c3e8)
Grafana dashboard monitoring










