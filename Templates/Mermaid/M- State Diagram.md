
```mermaid
stateDiagram-v2 
	[*] --> Still 
	Still --> [*] 
	Still --> Moving 
	Moving --> Still 
	Moving --> Crash 
	Crash --> [*]
```
(More Syntax [Here](https://mermaid-js.github.io/mermaid/#/stateDiagram))