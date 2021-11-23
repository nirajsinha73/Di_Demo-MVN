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
          //  bat ("cd src/main && Jenkinsfile.groovy")
            
          build job: 'd345', parameters: [[$class: 'StringParameterValue', name: 'param1', value: 'test_param']]
            
         //  build job: 'd123' , parameters: [String(name: 'param1', value: 'test_param')]
                  }
    }
    
}
}
