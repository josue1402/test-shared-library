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
    def projectFolder = configuration.projectFolder.dump()
    def buildCommand = configuration.buildCommand.values()    
//    ===================== Run pipeline stages =======================
        script.stage("build"){
            script.steps(projectFolder)
            script.steps(buildCommand)
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


