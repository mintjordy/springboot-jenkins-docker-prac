node {
    stage('Example') {
        def branchName = getCurrentBranch()
        echo 'My branch is' + branchName

        def getCurrentBranch () {
            return sh (
                script: 'git rev-parse --abbrev-ref HEAD',
                returnStdout: true
            ).trim()
        }
        if (branchName == 'master') {
            echo 'I only execute on the master branch'
        } else {
            echo 'I execute develop'
        }
    }
}