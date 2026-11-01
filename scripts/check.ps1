$ErrorActionPreference = 'Stop'
$repoRoot = Split-Path -Parent $PSScriptRoot
$sources = Get-ChildItem (Join-Path $repoRoot 'Java/Tutorials/src') -Filter '*.java'
$output = Join-Path $repoRoot 'Java/Tutorials/bin'
New-Item -ItemType Directory -Force $output | Out-Null
& javac -encoding UTF-8 -d $output $sources.FullName
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
foreach ($lesson in @('LearningChecks','HelloWorld','JavaDataTypes','JavaOperators','ReferenceTypes','Loops','Arrays','Methods','Collections','Exceptions','ClassesAndObjects','FileIO','Gradebook')) {
    Write-Output "--- $lesson ---"
    & java -cp $output $lesson
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
}
Write-Output "Compiled $($sources.Count) source files; all checks and demos passed."
