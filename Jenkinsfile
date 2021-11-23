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
           // bat 'cd src/main/'
            bat "cd src/main && Jenkinsfile"
            
         //   build job: 'Jenkinsfile' , parameters: [string( name: " ", value: " ")]
                  }
    }
    
}
}
