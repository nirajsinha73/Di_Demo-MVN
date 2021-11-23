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
            build job: 'demopipe' , parameters: [string( name: " ", value: " ")]
                  }
    }
    
}
}
