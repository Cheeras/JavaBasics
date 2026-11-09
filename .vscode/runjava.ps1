param(
    [string]$filePath,
    [string]$srcDir,
    [string]$binDir
)

# Compute fully qualified class name from file path
$relative = $filePath.Substring($srcDir.Length + 1)
$fqn = $relative -replace '\\', '.' -replace '\.java$', ''

# Compile
javac -d $binDir $filePath
if ($LASTEXITCODE -ne 0) { exit 1 }

# Run
java -cp $binDir $fqn
