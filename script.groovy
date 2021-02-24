def buildApp()
{
  echo 'building application'
}
def testApp()
 {
   when{
      expression{
           params.executeTest
         }
      }
    echo 'testing this app'
  }
def deployApp()
 {
   echo ' deploying the app'
   echo "versions are ${params.osversion}"
}

return this
