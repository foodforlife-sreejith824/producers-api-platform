AKS_SP="foodforlife-aks-sp"
AKS_CLUSTER_NAME="foodforlife-aks"
RESOURCE_GROUP="foodforlife-rg"
AKS_ROLE="contributor"

# Obtain the full registry ID for subsequent command args
AKS_REGISTRY_ID=$(az aks show --name $AKS_CLUSTER_NAME --resource-group $RESOURCE_GROUP --query id --output tsv)
echo "AKD Resource is : $AKS_REGISTRY_ID"

#service principal for AKS deployment
az ad sp delete --id http://$AKS_SP
az ad sp create-for-rbac --name http://$AKS_SP  --role $AKS_ROLE --scopes $AKS_REGISTRY_ID --sdk-auth --output json
#echo "Secret for for AKS deployment : $AKS_SP_AZ_CRED"
