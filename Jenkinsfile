pipeline {
  agent any
    parameters{
        choice(name:'version',choices:['1.0.1','1.0.2'],description:'')
        booleanParam(name:'executeTest',defaultValue:true,description:'')
            }
    stages {
       stage("build"){
        steps{
           echo 'this is build stage'
           }
         }
        stage("test"){
         when{
            expression{
                 params.executeTest
               }
            }
        steps{
           echo 'this is test stage'
           }
         }
        stage("deploy"){
        steps{
           echo 'this is build stage'
           echo "this is version ${params.version}"
           }
         }
        } 
       } 
