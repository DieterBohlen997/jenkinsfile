import hudson.model.Job



pipeline{
  agent any
  stages{
    stage('asd'){
      steps{
        script{
          println('asdasdasdasd')
          def helper = {
            Job job = currentBuild.rawBuild.parent
            println(job.definition.scm.getClass().getDeclaredFields())
         }
        helper()
      }
    }
  }
}
}
