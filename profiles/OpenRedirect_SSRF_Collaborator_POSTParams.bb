[
  {
    "ProfileName": "OpenRedirect_SSRF_Collaborator_POSTParams",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,http://{BC}",
      "true,//{BC}",
      "true,{BC}",
      "true,///{BC}",
      "true,http:{BC}",
      "true,\\/\\/{BC}",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}@{BC}",
      "true,{CURRENT_PROTOCOL}://{CURRENT_HOST}.{BC}",
      "true,http://{BC}\\\\@{CURRENT_HOST}/"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "All",
      "SSRF POST Parameters",
      "All POST Parameters"
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
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect_SSRF_Collaborator_POSTParams",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "The payload that generated the alert may not be the same as the one in the issue request, you have to make sure that it is the same by testing it manually.\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      1
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]