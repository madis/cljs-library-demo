## Test App

### Build & run

1. Using `clj`
  - `clj -M -m cljs.main --target node --output-to main.js -c test-app.core`
  - `node main.js`
2. Using `shadow-cljs`
  - `npx shadow-cljs compile node-script-build`
  - `node out/node-script-build.js`
