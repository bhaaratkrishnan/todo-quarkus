# Todo_app using Quarkus 
Quarkus is a Kubernetes-native Java framework mainly aimed at building microservices. 
Using Quarkus, we will be building this todo application

## Requirements
- JDK 11+ should be installed
- Visual Studio Code with the following extensions
  * Thunder Client https://marketplace.visualstudio.com/items?itemName=rangav.vscode-thunder-client
  * Extension Pack for Java Name: Extension Pack for Java https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack
  * Maven for Java Name https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven
  * Project Manager https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency
  * Liberty Tools https://marketplace.visualstudio.com/items?itemName=Open-Liberty.liberty-dev-vscode-ext
  
# Step 1
## Install Quarkus via Command Line Interface
### For Linux, macOS and Windows(WSL)
```shell script 
curl -Ls https://sh.jbang.dev | bash -s - trust add https://repo1.maven.org/maven2/io/quarkus/quarkus-cli/
curl -Ls https://sh.jbang.dev | bash -s - app install --fresh --force quarkus@quarkusio
```
### For Windows Powershell
```shell script
iex "& { $(iwr https://ps.jbang.dev) } trust add https://repo1.maven.org/maven2/io/quarkus/quarkus-cli/"
iex "& { $(iwr https://ps.jbang.dev) } app install --fresh --force quarkus@quarkusio"
```
Once installed Restart shell!

# Step 2
## Create Application
```shell script 
quarkus create todo_app
```

# Step 3
## To Run the Application
```shell script 
quarkus dev
```
# CONGRATS!
**Quarkus Application is now running on http://localhost:8080**
If successful you will get the following web page

<img width="1431" alt="Screenshot 2023-05-02 at 6 37 57 PM" src="https://user-images.githubusercontent.com/132255692/235675504-1aa8309d-2044-4514-8584-aa73c2525531.png">

