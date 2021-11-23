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
          // bat "cd src/main && Jenkinsfile"
            
            build job: '<Project name>', parameters: [[$class: 'StringParameterValue', name: 'param1', value: 'test_param']]
            
           build job: 'd123' , parameters: [(name: 'param1', value: 'test_param')]
                  }
    }
    
}
}
