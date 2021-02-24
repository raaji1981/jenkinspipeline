def gv
pipeline{
  agent any
   parameters{
    choice(name:'os version',choices:['linux','windows','Mac'],description:'')
    booleanParam(name:'executeTest',defaultValue:true,description:'')
    }
    stages{
       stage("init"){
          steps {
            script{
                gv=load "script.groovy"
              }
         }
     }
      
        stage("build"){
          steps {
               script{
                  gv.buildApp()
                }
            }
        }

        stage("test"){
          steps {
              script{
                 gv.testApp()
              }
           }
        }
        
        stage("deploy"){
            steps{
                script{
                   gv.deployApp()
                }
            }
        }
  
             
  
