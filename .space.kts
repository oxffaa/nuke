// ------------------------------------------------------------------------------
// <auto-generated>
//
//     This code was generated.
//
//     - To turn off auto-generation set:
//
//         [SpaceAutomation (AutoGenerate = false)]
//
//     - To trigger manual generation invoke:
//
//         nuke --generate-configuration SpaceAutomation --host SpaceAutomation
//
// </auto-generated>
// ------------------------------------------------------------------------------

job("continuous") {
    container("mcr.microsoft.com/dotnet/sdk:5.0") {
        startOn {
            gitPush {
                enabled = true
            }
        }
        shellScript {
            content = "./build.sh Test"
        }
    }
}
