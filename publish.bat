:: PedroPathing publish & deployment
:: Written by Rowan McAlpin<https://github.com/rowan-mcalpin>
:: Version 0.1
@echo off
ECHO "Publishing PedroPathing..."
CALL ./gradlew publish
CD maven.pedropathing.com
ECHO "Committing changes..."
CALL git add .
CALL git commit -m "Update repositories"
CALL git push
CD ..
ECHO "Finishing up..."
CALL git add maven.pedropathing.com
CALL git commit -m "Update repositories"
CALL git push
ECHO "Publish complete!"