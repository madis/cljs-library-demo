## Test Lib

Simple Clojurescript library to demonstrate how
  - manage dependencies using `deps.edn`
  - how to build for testing using `shadow-cljs` (node.js, browser, CI (headless browser))
  - how to release to Clojars using `tools.build`

### Run tests

1. Node tests
  - `npx shadow-cljs compile test`
  - `node out/node-tests.js`
2. Browser tests
  - `npx shadow-cljs watch test-browser`
  - Open http://d0x-vm:6502 in browser (gets re-compiled & refreshed on each test change)
3. CI tests (via Karma)
  - export CHROME_BIN=`which chromium-browser`
  - `npx shadow-cljs compile test-ci`
  - `npx karma start --single-run`

### Build & release

1. Build JAR (under target/test-lib-<...>.jar) `clj -T:build jar`
2. Deploy to clojars
  - need to have `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` env variables set
  - `clj -T:build deploy`
