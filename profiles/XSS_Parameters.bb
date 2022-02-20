[
  {
    "ProfileName": "XSS_Parameters",
    "Name": "",
    "Enabled": true,
    "Scanner": 3,
    "Author": "@burpbounty",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,All parameters name,^q$",
      "true,Or,All parameters name,^s$",
      "true,Or,All parameters name,^search$",
      "true,Or,All parameters name,^id$",
      "true,Or,All parameters name,^lang$",
      "true,Or,All parameters name,^keyword$",
      "true,Or,All parameters name,^query$",
      "true,Or,All parameters name,^page$",
      "true,Or,All parameters name,^keywords$",
      "true,Or,All parameters name,^year$",
      "true,Or,All parameters name,^view$",
      "true,Or,All parameters name,^email$",
      "true,Or,All parameters name,^type$",
      "true,Or,All parameters name,^name$",
      "true,Or,All parameters name,^p$",
      "true,Or,All parameters name,^month$",
      "true,Or,All parameters name,^immagine$",
      "true,Or,All parameters name,^list_type$",
      "true,Or,All parameters name,^url$",
      "true,Or,All parameters name,^terms$",
      "true,Or,All parameters name,^categoryid$",
      "true,Or,All parameters name,^key$",
      "true,Or,All parameters name,^l$",
      "true,Or,All parameters name,^begindate$",
      "true,Or,All parameters name,^enddate$",
      "true,Or,All parameters name,^callback$",
      "true,Or,All parameters name,^jsonp$",
      "true,Or,All parameters name,^api$",
      "true,Or,All parameters name,^password$",
      "true,Or,All parameters name,^emailto$",
      "true,Or,All parameters name,^token$",
      "true,Or,All parameters name,^username$",
      "true,Or,All parameters name,^item$",
      "true,Or,All parameters name,.*_id$",
      "true,Or,All parameters name,.*_key$",
      "true,Or,All parameters name,.*_token$",
      "true,Or,All parameters name,.*search$"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "XSS_Parameters",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "Based in top 25 XSS parameters by @trbughunters and GF patterns by @1ndianl33t.\u003cbr/\u003e\n\nI also add more parameters and regex.\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": true,
    "Scantype": 2,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]