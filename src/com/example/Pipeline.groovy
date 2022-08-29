package com.example

class Pipeline {
    def script
    def configurationFile

    Pipeline(script, configurationFile) {
        this.script = script
        this.configurationFile = configurationFile
    }

    def execute() {
//    ===================== Your Code Starts Here =====================
//    Note : use "script" to access objects from jenkins pipeline run (WorkflowScript passed from Jenkinsfile)
//           for example: script.node(), script.stage() etc
    
//    ===================== Parse configuration file ==================
    projectFolder = configuration.projectFolder
    buildCommand = configuration.buildCommand    
//    ===================== Run pipeline stages =======================
        script.stage("build"){
            steps {
                echo "$projectFolder"
                echo "$buildCommand"
            }
        }
        script.stage("database"){
        }
        script.stage("deploy"){
        }
        script.stage("test"){
        }
//    ===================== End pipeline ==============================
    }
}


