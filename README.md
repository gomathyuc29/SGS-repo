# ascend-repo
This repository is created to help host projects which are developed as part of ascend progra

HelloWorld
-----------
This project uses SpringBoot to print a random text message using a REST controller.
Project was first tested locally to check if it gives the desired results.
Project was then pushed to PCF using CF CLI where it was deployed in a particular space consuming 1GB.
The PCF push was then automated through a Jenkins job by creating a multibranch pipeline(Jenkisfile and manifest.yml added for this purpose)

Steps for CF CLI installation
-------------------------------
Please visit the site https://pivotal.io/platform/pcf-tutorials/getting-started-with-pivotal-cloud-foundry/introduction.
Download CF CLI for Windows 64 bit and install the same.
Check for installation using the commands : cf help -a  or cf version.
Register with pivotal to create a free account and login. You can create your own org and space.
In your windows cmd,login to CF through CLI using cf login command.
API endpoint: https://api.run.pivotal.io.
Provide your credentials.

CF CLI commands for PCF 
--------------------------
cf apps : shows various apps available in that space

cf push PCF app name -p target jar to be pushed
eg:cf push Hello2929 -p ProductManagementSystem-0.0.1-SNAPSHOT.jar

cf delete -r appname : removes an application from a given PCF space

Steps for Jenkins job deployment
------------------------------
1)Install Jenkins
2)Get the jenkins.war running on a desired port using java -jar jenkins.war --httpPort=<portnumber> command
3)Add the two files manifest.yml and Jenkinsfile to the HelloWorld application.The commands for maven package and cf 
commands for PCF push goes within Jenkinsfile.Manifest.yml has parameters to be provided for cf push command.
4)Create a Jenkins job - Multibranch pipeline and configure the below details
  a)Confugure github credentials
  b)Add the Github repository url that points to root folder - https://github.com/gomathyuc29/ascend-repo.git
  c)Configure Build Configuration - Mention mode as by Jenkinsfile and provide script path as <proj-name>/Jenkinsfile
  d)Save the changes
5)Under Manage plugins, install the maven integration plugin.
6)Under Global Tool Configuration, you can configure for JDK,GIT and MAVEN which are locally installed in your system or you can provide
the option as install automatically
7)Start the build for your project and observe the console output.

The build should show logs for a successfull maven packaging for the jar,successful PCF login and PCF push.
The ultimate status for the build also should show up as SUCCESS.
  
ProductManagementSystem
---------------------------
This project uses SpringBoot to implement a case study on a Product Management system using JSPs as view.
The CRUD functionalities covered are:
	a)Add Product to the system
	b)View all products
	c)View single product by productid
	d)Update a given product
	e)Delete/Remove a given product.

The project works perfectly on embedded tomcat when run as SpringBoot application. But when hosted from the target jar, project runs into HTTP 404-whitelabelerror as project is unable to locate the WEB-INF/JSP/index.jsp file.

This is WIP
	





