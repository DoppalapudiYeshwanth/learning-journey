import Product from "./Product";

function ProductTab(){
    let options = ["Hard","flexible","long-lasting"]
    return(
        <>
        <Product title="Cell" price={3000} features={["Hard","flexible","long-lasting"]}></Product>
        <Product title="Balli" price={40000} features={options}></Product>
        <Product title="Puli" features={options}></Product>
        </>
    )
}

export default ProductTab;