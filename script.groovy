def buildApp()
{
  echo 'building application'
}
def testApp()
{
    echo 'testing this app'
  }
def deployApp()
 {
   echo ' deploying the app'
   echo "versions are ${params.osversion}"
}
return this
