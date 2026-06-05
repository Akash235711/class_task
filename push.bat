@echo off
setlocal

git add .
git diff --cached --quiet
if errorlevel 1 (
  git commit -m "Update files"
)

git push origin main
