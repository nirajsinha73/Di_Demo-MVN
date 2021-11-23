//@Library('Shared-Lib') _

pipeline{
    agent any
    stages{
        
    stage('Demo')
    {
        steps
        { 
            
            echo " demo"
        }
    }
    
       stage(' Invoke Demo')
    {
        steps
        { 
            sh "cd ws/src/main/"
            build job: 'Jenkinsfile' , parameters: [string( name: " ", value: " ")]
                  }
    }
    
}
}
